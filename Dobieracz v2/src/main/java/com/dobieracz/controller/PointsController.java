package com.dobieracz.controller;

import com.dobieracz.model.AlgorytmBLC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 *
 * @since Mar 27, 2018, 3:49:22 PM
 * @author Grzegorz Brodowski
 */
@Controller
public class PointsController {
    AlgorytmBLC blc;

    @RequestMapping(value = "/pointsForm", method = RequestMethod.GET)
    public String showPointsForm() {
        return "pointsForm";
    }

    @RequestMapping(value = "/pointsForm", method = RequestMethod.POST)
    public String editPointsForm(ModelMap model,@RequestParam String vAI,
                                                @RequestParam String vBI,
                                                @RequestParam String vBO) {
        blc=new AlgorytmBLC(Double.valueOf(vAI), Double.valueOf(vBI),0, Double.valueOf(vBO));
        
        model.put("wynik", blc.toStringWynik());
        return "pointsForm";
    }
    
//     @RequestMapping(value = "/pointsForm", method = RequestMethod.POST)
//    public String showPointsForm(ModelMap model, @RequestParam("vBI") String data) {
//        model.put("wynik", data);
//        return "pointsForm";
//    }

}
