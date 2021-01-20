package com.moon.example.studybook.service;

import com.moon.example.studybook.data.User;
import com.moon.example.studybook.exception.UserAlreadyRegisteredException;
import com.moon.example.studybook.repository.JdbcUserRepository;
import com.moon.example.studybook.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;


public class UserServiceImpl implements UserSerivce{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(DataSource dataSource){
        this.passwordEncoder = new BCryptPasswordEncoder();
        this.userRepository = new JdbcUserRepository(dataSource);
    }

    @Override
    public void register(User user, String rawPassword) throws UserAlreadyRegisteredException{
        if(this.userRepository.countByUsername(user.getUsername())> 0){
            throw new UserAlreadyRegisteredException();
        }

        user.setPassword(this.passwordEncoder.encode(rawPassword));
        this.userRepository.save(user);
    }
}
