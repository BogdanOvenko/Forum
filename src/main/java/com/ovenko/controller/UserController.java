package com.ovenko.controller;


import com.ovenko.model.User;
import com.ovenko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout,
                        Model model){

        if (error != null) {
            model.addAttribute("error", "Invalid user name or password");
        }
        if (logout !=null) {
            model.addAttribute("message", "You have been logged out successfully");
        }
        model.addAttribute("newUser", new User());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody String login(@ModelAttribute("newUser") User user, Model model) {
        User existingUser = userService.getUser(user.getId());
        if (existingUser != null) {
            model.addAttribute("welcomeUser", existingUser);
            return "welcome";
        }
        return "error";
    }

    @RequestMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("newUser", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("newUser") User user, Model model) {
        User existingUser = userService.addUser(user);
        if (existingUser != null) {
            model.addAttribute("welcomeUser", existingUser);
        }
        return "home";
    }

}
