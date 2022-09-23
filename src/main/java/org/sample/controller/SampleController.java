package org.sample.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j
public class SampleController {

    @PostMapping("/")
    public ModelAndView index(){
        log.info("index controller start!!");

        ModelAndView mav = new ModelAndView();
        mav.addObject("title", "Login");
        mav.addObject("content", "Hello World!!");
        mav.setViewName("index");

        return mav;
    }

    @GetMapping("/main")
    public String Main(){
        return "main";
    }
}