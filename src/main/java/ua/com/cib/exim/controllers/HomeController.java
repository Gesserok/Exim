package ua.com.cib.exim.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(ModelMap map) {
        return "redirect:/empty";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String deny(ModelMap map) {
        return "403";
    }


    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String loginPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:empty";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
    }

    @RequestMapping(value = "/empty", method = RequestMethod.GET)
    public String empty(ModelMap map) {
        return "/empty";
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
    }

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home() {
//		return "list";
//	}


}
