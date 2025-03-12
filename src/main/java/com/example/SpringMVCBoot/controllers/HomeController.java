package com.example.SpringMVCBoot.controllers;

import com.example.SpringMVCBoot.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String showHomePage(){
        System.out.println("showing home page");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String showSearchPage(){
        System.out.println("User is in search page");
        return "search";
    }

    @GetMapping("/goToLogin")
    public String showLoginPage(){
        System.out.println("User is in Login page");
        return "login";
    }
    @GetMapping("/goToRegistration")
    public String showRegistrationPage(){
        System.out.println("User is in Registration page");
        return "register";
    }

    @ModelAttribute("newuser")
    public User defaultUserData(){
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> defaultGenderData(){
        return Arrays.asList(new String[]{"Male","Female","Other"});
    }
}
