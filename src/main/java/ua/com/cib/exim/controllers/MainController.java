package ua.com.cib.exim.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.com.cib.exim.exception.SQLEntityAbsentException;
import ua.com.cib.exim.model.User;
import ua.com.cib.exim.services.UserService;

import java.util.List;
//import ua.com.cib.exim.service.UserService;


@Controller
public class MainController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello1(ModelMap map) {
        return "redirect:list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String hello(ModelMap map) {
        List<User> list = service.list();
        map.addAttribute("list", service.list());
        return "list";
    }

    @RequestMapping (value = "/create", method = RequestMethod.GET)
    public ModelAndView createNewForm() {
        ModelAndView modelAndView = new ModelAndView("addForm");
        modelAndView.getModelMap().addAttribute("newUser", new User());
        return modelAndView;
    }

    @RequestMapping (value = "/update", method = RequestMethod.GET)
    public ModelAndView updateUser(@RequestParam String login) {
        ModelAndView modelAndView = new ModelAndView("updateForm");
        modelAndView.getModelMap().addAttribute("updateUser", service.get(login));
        return modelAndView;
    }

    @RequestMapping (value = "/submitNew", method = RequestMethod.POST)
    public ModelAndView createUser(@ModelAttribute User newUser) {
        service.add(newUser);
        return new ModelAndView("redirect:list");
    }

    @RequestMapping (value = "/submitUpdate", method = RequestMethod.POST)
    public ModelAndView updateUser(@ModelAttribute User updateUser) {
        service.update(updateUser);
        return new ModelAndView("redirect:list");
    }

    @RequestMapping (value = "/delete", method = RequestMethod.GET)
    public ModelAndView deleteUser(@RequestParam String login) throws SQLEntityAbsentException {
        service.delete(login);
        return new ModelAndView("redirect:list");
    }

    @RequestMapping(value = {"/assets/js/bootstrap.min.js"}, method = RequestMethod.GET)
    public String asses() {
        return "/assets/js/bootstrap.min.js";
    }

}
