package com.ovenko.controller;

import com.ovenko.service.CommentService;
import com.ovenko.service.TopicService;
import com.ovenko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class AdminController {

    @Autowired
    UserService userService;
    @Autowired
    TopicService topicService;
    @Autowired
    CommentService commentService;


}
