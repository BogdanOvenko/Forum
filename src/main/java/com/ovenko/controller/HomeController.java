package com.ovenko.controller;

import com.ovenko.model.User;
import com.ovenko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home(@CookieValue(value = "userId", required = false) Long userId,
                       Model model) {
        if (userId == null){
            return "home";
        }
        model.addAttribute("user", userService.getUser(userId));
        return "home";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String home(@ModelAttribute("user") User user,
                       @ModelAttribute("user_id") Long user_id,
                       Model model){
        User existingUser = userService.getUser(user_id);
        if(existingUser != null) {
            model.addAttribute("title", "Home");
            model.addAttribute("user", existingUser);
        }
        return "home";
    }
}
