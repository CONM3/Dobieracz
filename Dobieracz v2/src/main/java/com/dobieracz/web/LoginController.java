package com.dobieracz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 *
 * @since Mar 25, 2018, 2:48:17 PM
 * @author Grzegorz Brodowski
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public String sayHello() {
        return "Hello World dummy";
    }  

}
