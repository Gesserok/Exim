package ua.com.cib.exim.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.com.cib.exim.model.EximAliase;
import ua.com.cib.exim.services.AliaseService;

import java.util.List;

@Controller
public class AliaseController {
    @Autowired
    private AliaseService service;

    @RequestMapping(value = "/admin/aliase/list", method = RequestMethod.GET)
    public String aliases(ModelMap map) {

        if (!hasRole("ROLE_ADMIN")) return "403";

        List<EximAliase> list = service.listOfAliase();
        map.addAttribute("aliase", list);
        return "aliase";
    }
    @RequestMapping (value = "/admin/aliase/create", method = RequestMethod.GET)
    public ModelAndView createNewAliaseForm() {

        if (!hasRole("ROLE_ADMIN")) return new ModelAndView("redirect:/403");

        ModelAndView modelAndView = new ModelAndView("addAliaseForm");
        modelAndView.getModelMap().addAttribute("newAliase", new EximAliase());
        return modelAndView;
    }

    @RequestMapping (value = "/admin/aliase/update", method = RequestMethod.GET)
    public ModelAndView updateAliase(@RequestParam String localPart) {

        if (!hasRole("ROLE_ADMIN")) return new ModelAndView("redirect:/403");

        ModelAndView modelAndView = new ModelAndView("updateAliaseForm");
        modelAndView.getModelMap().addAttribute("updateAliase", service.get(localPart));
        return modelAndView;
    }

    @RequestMapping (value = "/admin/aliase/submitNew", method = RequestMethod.POST)
    public ModelAndView createAliase(@ModelAttribute EximAliase newAliase) {

        if (!hasRole("ROLE_ADMIN")) return new ModelAndView("redirect:/403");

        service.add(newAliase);
        return new ModelAndView("redirect:/admin/aliase/list");
    }

    @RequestMapping (value = "/admin/aliase/submitUpdate", method = RequestMethod.POST)
    public ModelAndView updateAliase(@ModelAttribute EximAliase updateAliase) {

        if (!hasRole("ROLE_ADMIN")) return new ModelAndView("redirect:/403");

        service.update(updateAliase);
        return new ModelAndView("redirect:/admin/aliase/list");
    }

    @RequestMapping (value = "/admin/aliase/delete" , method = RequestMethod.GET)
    public ModelAndView deleteAliase(@RequestParam String localPart){

        if (!hasRole("ROLE_ADMIN")) return new ModelAndView("redirect:/403");

        service.delete(localPart);
        return new ModelAndView("redirect:/admin/aliase/list");
    }

    private boolean hasRole(String role) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return authentication.getAuthorities().stream()
                .anyMatch(r -> r.getAuthority().equals(role));
    }
}
