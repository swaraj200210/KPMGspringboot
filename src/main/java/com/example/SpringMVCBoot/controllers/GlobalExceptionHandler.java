package com.example.SpringMVCBoot.controllers;

import exceptions.ApplicationException;
import exceptions.LoginFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("Login User Failed - Login Controller Class");
        return "error";
    }
    @ExceptionHandler(LoginFailureException.class)
    public ResponseEntity handleLoginFailureException(LoginFailureException ex){
        System.out.println("Login User Failed - Login Controller Class");
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
    }

}
