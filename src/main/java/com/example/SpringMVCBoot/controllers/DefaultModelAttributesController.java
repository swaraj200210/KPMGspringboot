package com.example.SpringMVCBoot.controllers;

import com.example.SpringMVCBoot.beans.Login;
import com.example.SpringMVCBoot.beans.User;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

public class DefaultModelAttributesController {
    @ModelAttribute("newuser")
    public User defaultUserData(){
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> defaultGenderData(){
        return Arrays.asList(new String[]{"Male","Female","Other"});
    }
    @ModelAttribute("login")
    public Login defaultLoginData(){
        return new Login();
    }
}
