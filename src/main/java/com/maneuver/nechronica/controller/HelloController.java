package com.maneuver.nechronica.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", required=false, defaultValue="ネクロニカ") String name, Model model) {
        model.addAttribute("name", name);
	return "hello";
    }
}
