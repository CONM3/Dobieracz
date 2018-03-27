package com.dobieracz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 *
 * @since Mar 27, 2018, 3:49:22 PM
 * @author Grzegorz Brodowski
 */

@Controller
public class PointsController {

    @RequestMapping(value="/pointsForm", method=RequestMethod.GET)
    public String showPointsForm(){
        return "pointsForm";
    }
}