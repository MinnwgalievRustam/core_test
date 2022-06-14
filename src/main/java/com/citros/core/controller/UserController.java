package com.citros.core.controller;

import com.citros.core.model.Assignment;
import com.citros.core.model.User;
import com.citros.core.service.implementation.UserServiceImpl;
import com.citros.core.service.interface_impl.AssignmentService;
import com.citros.core.service.interface_impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public String findAll(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }


    @GetMapping("/users/{id}")
    public User sayHello(@PathVariable Long id) {
        return userService.getUser(id);
    }


}
