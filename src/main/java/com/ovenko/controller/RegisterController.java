package com.ovenko.controller;


import com.ovenko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class RegisterController {

    @Autowired
    private UserService userService;


}
