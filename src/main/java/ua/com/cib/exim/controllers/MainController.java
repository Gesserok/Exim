package ua.com.cib.exim.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.cib.exim.model.User;
import ua.com.cib.exim.services.UserService;
//import ua.com.cib.exim.service.UserService;


@Controller
public class MainController {

    @Autowired
    private UserService service;


    @RequestMapping (value = "/hello")
    public String hello(ModelMap map) {
        map.addAttribute("list", service.list());
        return "index";
    }
}
