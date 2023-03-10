package com.example.demopojo.controllers;


import com.example.demopojo.models.User;
import com.example.demopojo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/all")
    public String getAll(ModelMap modelMap){
        List<User> users = userService.getAll();
        modelMap.addAttribute("users",users);
        return "index";
    }

    @GetMapping("/users/one/{user_id}")
    public String getOne(@PathVariable("user_id") Integer id, ModelMap modelMap){
        User user = userService.getOne(id);
        modelMap.addAttribute("oneUser",user);
        return "view-user";
    }
}
