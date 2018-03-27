package com.dobieracz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String postMethod(ModelMap model, @RequestParam String name) {
        model.put("name", name);
        return "welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginMessage(ModelMap model) {
        return "login";
    }

    @RequestMapping("/")
    @ResponseBody
    public String welcomeMessage() {
        return "siemka wszystkim";
    }
}
