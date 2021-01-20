package com.moon.example.studybook.repository;

import com.moon.example.studybook.data.User;

public interface UserRepository{
    User save(User user);
    int countByUsername(String username);
}
