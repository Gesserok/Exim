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
import ua.com.cib.exim.model.EximAliase;
import ua.com.cib.exim.services.AliaseService;

import java.util.List;

@Controller
public class AliaseController {
    @Autowired
    private AliaseService service;

    @RequestMapping(value = "/aliase/list", method = RequestMethod.GET)
    public String aliases(ModelMap map) {
        List<EximAliase> list = service.listOfAliase();
        map.addAttribute("aliase", service.listOfAliase());
        return "aliase";
    }
    @RequestMapping (value = "/aliase/create", method = RequestMethod.GET)
    public ModelAndView createNewAliaseForm() {
        ModelAndView modelAndView = new ModelAndView("addAliaseForm");
        modelAndView.getModelMap().addAttribute("newAliase", new EximAliase());
        return modelAndView;
    }

    @RequestMapping (value = "/aliase/update", method = RequestMethod.GET)
    public ModelAndView updateAliase(@RequestParam String localPart) {
        ModelAndView modelAndView = new ModelAndView("updateAliaseForm");
        modelAndView.getModelMap().addAttribute("updateAliase", service.get(localPart));
        return modelAndView;
    }

    @RequestMapping (value = "/aliase/submitNew", method = RequestMethod.POST)
    public ModelAndView createAliase(@ModelAttribute EximAliase newAliase) {
        service.add(newAliase);
        return new ModelAndView("redirect:/aliase/list");
    }

    @RequestMapping (value = "/aliase/submitUpdate", method = RequestMethod.POST)
    public ModelAndView updateAliase(@ModelAttribute EximAliase updateAliase) {
        service.update(updateAliase);
        return new ModelAndView("redirect:/aliase/list");
    }

    @RequestMapping (value = "/aliase/delete", method = RequestMethod.GET)
    public ModelAndView deleteAliase(@RequestParam String localPart) throws SQLEntityAbsentException {
        service.delete(localPart);
        return new ModelAndView("redirect:/aliase/list");
    }
}
