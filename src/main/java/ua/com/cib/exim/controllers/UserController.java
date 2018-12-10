package ua.com.cib.exim.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.com.cib.exim.model.EximAliase;
import ua.com.cib.exim.model.User;
import ua.com.cib.exim.services.AliaseService;
import ua.com.cib.exim.services.UserService;

import java.util.Collection;
import java.util.List;
//import ua.com.cib.exim.aliaseService.UserService;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AliaseService aliaseService;




    @RequestMapping(value = "/exim/user/aliase/list", method = RequestMethod.GET)
    public String list(ModelMap map) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (!hasRole("ROLE_GO")) return "redirect:/exim/403";


        String currentUserName = null;
        User currentUser = null;
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            currentUserName = authentication.getName();
            currentUser = userService.get(currentUserName);
        }

        List<EximAliase> list = aliaseService.listOfAliase(currentUser);
        map.addAttribute("aliase",list);
        return "aliase";
    }

    @RequestMapping (value = "/exim/user/changepassword", method = RequestMethod.GET)
    public ModelAndView updateUser(@ModelAttribute String updateUser) {

        if (!hasRole("ROLE_GO"))  return new ModelAndView("redirect:/403");

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String login = "";
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            login = authentication.getName();
        }

        ModelAndView modelAndView = new ModelAndView("updateForm");
        modelAndView.getModelMap().addAttribute("updateUser", userService.get(login));
        return modelAndView;
    }

    @RequestMapping (value = "/exim/user/submitUpdate", method = RequestMethod.POST)
    public ModelAndView updateUser(@ModelAttribute User updateUser) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        Collection<SimpleGrantedAuthority> authorities =
//                (Collection<SimpleGrantedAuthority>)  SecurityContextHolder.getContext().getAuthentication().getAuthorities();
//

        if (!hasRole("ROLE_GO")) return new ModelAndView("redirect:/exim/403");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String currentUserName = null;
        User currentUser = null;
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            currentUserName = authentication.getName();
        }
        if (!currentUserName.equals(updateUser.getLogin())) return new ModelAndView("redirect:/exim/403");

        userService.update(updateUser);
        return new ModelAndView("redirect:/exim/empty");
    }


    private boolean hasRole(String role) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return authentication.getAuthorities().stream()
                .anyMatch(r -> r.getAuthority().equals(role));
    }
}
