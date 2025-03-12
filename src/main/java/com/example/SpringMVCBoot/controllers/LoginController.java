package com.example.SpringMVCBoot.controllers;

import com.example.SpringMVCBoot.beans.Login;
import com.example.SpringMVCBoot.beans.User;
import com.example.SpringMVCBoot.repository.UserRepository;
import exceptions.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login") Login login){
        User user = userRepository.searchByName(login.getUsername());
        if(user == null){
            throw new ApplicationException("User Not Found!");
        }
        return "search";
    }
    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("Login User Failed - Login Controller Class");
        return "error";
    }
}
