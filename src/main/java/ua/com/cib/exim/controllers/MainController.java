package ua.com.cib.exim.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.com.cib.exim.model.User;
import ua.com.cib.exim.services.UserService;

import java.util.List;
//import ua.com.cib.exim.service.UserService;


@Controller
public class MainController {

    @Autowired
    private UserService service;

    @RequestMapping (value = "/list")
    public String hello(ModelMap map) {
        List<User> list = service.list();
        map.addAttribute("list", service.list());
        return "index";
    }

    @RequestMapping (value = "/create")
    public ModelAndView createNewForm() {
        ModelAndView modelAndView = new ModelAndView("form");
        modelAndView.getModelMap().addAttribute("newUser", new User());
        return modelAndView;
    }

    @RequestMapping (value = "/submit")
    public ModelAndView createNewUser(@ModelAttribute User newUser) {
        service.add(newUser);
        return new ModelAndView("redirect:list");
    }


}
