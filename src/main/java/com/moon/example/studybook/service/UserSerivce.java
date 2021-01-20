package com.moon.example.studybook.service;

import com.moon.example.studybook.data.User;
import com.moon.example.studybook.exception.UserAlreadyRegisteredException;

public interface UserSerivce {
    void register(User user, String rawPassword) throws UserAlreadyRegisteredException;
}
