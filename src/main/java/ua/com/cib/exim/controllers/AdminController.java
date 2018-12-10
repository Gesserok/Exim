package ua.com.cib.exim.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.com.cib.exim.model.EximAliase;
import ua.com.cib.exim.model.User;
import ua.com.cib.exim.services.UserService;

import java.util.Collection;
import java.util.List;
//import ua.com.cib.exim.service.UserService;


@Controller
public class AdminController {

    @Autowired
    private UserService service;




    @RequestMapping(value = "/admin/user/list", method = RequestMethod.GET)
    public String list(ModelMap map) {

        if (!hasRole("ROLE_ADMIN")) return "403";

        List<User> list = service.list();
        map.addAttribute("list", service.list());
        return "list";
    }

    @RequestMapping (value = "/admin/user/create", method = RequestMethod.GET)
    public ModelAndView createNewForm() {

        if (!hasRole("ROLE_ADMIN")) return new ModelAndView("redirect:/403");

        ModelAndView modelAndView = new ModelAndView("addForm");
        modelAndView.getModelMap().addAttribute("newUser", new User());
        return modelAndView;
    }

    @RequestMapping (value = "/admin/user/update", method = RequestMethod.GET)
    public ModelAndView updateUser(@RequestParam String login) {

        if (!hasRole("ROLE_ADMIN")) return new ModelAndView("redirect:/403");

        ModelAndView modelAndView = new ModelAndView("updateForm");
        modelAndView.getModelMap().addAttribute("updateUser", service.get(login));
        return modelAndView;
    }

    @RequestMapping (value = "/admin/user/submitNew", method = RequestMethod.POST)
    public ModelAndView createUser(@ModelAttribute User newUser) {

        if (!hasRole("ROLE_ADMIN")) return new ModelAndView("redirect:/403");

        service.add(newUser);
        return new ModelAndView("redirect:list");
    }

    @RequestMapping (value = "/admin/user/submitUpdate", method = RequestMethod.POST)
    public ModelAndView updateUser(@ModelAttribute User updateUser) {

        if (!hasRole("ROLE_ADMIN")) return new ModelAndView("redirect:/403");

        service.update(updateUser);
        return new ModelAndView("redirect:list");
    }

    @RequestMapping (value = "/admin/user/delete", method = RequestMethod.GET)
    public ModelAndView deleteUser(@RequestParam String login) {

        if (!hasRole("ROLE_ADMIN")) return new ModelAndView("redirect:/403");

        service.delete(login);
        return new ModelAndView("redirect:list");
    }

//    @RequestMapping(value = {"/assets/js/bootstrap.min.js"}, method = RequestMethod.GET)
//    public String asses() {
//        return "/assets/js/bootstrap.min.js";
//    }

    private boolean hasRole(String role) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return authentication.getAuthorities().stream()
                .anyMatch(r -> r.getAuthority().equals(role));
    }

}
