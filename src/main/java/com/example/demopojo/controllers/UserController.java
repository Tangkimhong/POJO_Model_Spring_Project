package com.example.demopojo.controllers;


import com.example.demopojo.models.User;
import com.example.demopojo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/users/add")
    public String showAddUser(Model model){
        model.addAttribute("user",new User());
        return "add-new";
    }

    @PostMapping("/users/add/submit")
    public String submitUser(User user){
        this.userService.Save(user);
        return "redirect:/users/all";
    }

    @GetMapping("/users/update/{user_id}")
    public String showUpdate(@PathVariable("user_id") Integer id, Model model){
        User user = userService.getOne(id);
        model.addAttribute("user",user);
        return "update-user";
    }

    @PostMapping ("/users/update/submit")
    public String updateUser(User user){
        this.userService.update(user);
        return "redirect:/users/all";
    }

    @GetMapping("/users/delete/{user_id}")
    public String deleteUser(@PathVariable("user_id") Integer id){
        this.userService.delete(id);
        return "redirect:/users/all";
    }
}
