package com.moon.example.studybook.controller;

import com.moon.example.studybook.controller.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping
    public void save(User user) {

    }
}
