package com.xyinc.poi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping( "/login" )
    private String login() {

        return "login";
    }


    @GetMapping( "/login-error" )
    public String loginError( Model model ) {

        model.addAttribute( "loginError", true );
        return "login";
    }


    @GetMapping( "/" )
    private String index() {

        return "index";
    }

}
