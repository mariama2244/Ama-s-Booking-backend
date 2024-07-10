package com.doranco.amasbooking.controller.web;

import com.doranco.amasbooking.model.entity.User;
import com.doranco.amasbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {



    @GetMapping("/")
    public String viewHomePage(){
        return "index";
    }
}
