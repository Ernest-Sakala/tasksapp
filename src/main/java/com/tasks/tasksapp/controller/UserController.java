package com.tasks.tasksapp.controller;

import com.tasks.tasksapp.model.RoleModel;
import com.tasks.tasksapp.model.UserModel;
import com.tasks.tasksapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;

@Controller
public class UserController {

    private static Logger log= Logger.getLogger(UserController.class.getName());

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/registerUser")
    public String getRegistrationForm(Model model) {
        model.addAttribute("userModel", new UserModel());
        return "register";
    }


    @PostMapping("/register")
    public String registerUser(@ModelAttribute UserModel userModel, Model model) {

        userService.registerUser(userModel);

        log.info(userModel.toString());

        return "redirect:/login";
    }
}
