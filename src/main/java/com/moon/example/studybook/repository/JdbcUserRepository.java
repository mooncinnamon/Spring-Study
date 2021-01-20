package com.moon.example.studybook.repository;

import com.moon.example.studybook.data.User;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class JdbcUserRepository implements UserRepository{
    public JdbcUserRepository(DataSource dataSource) {

    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public int countByUsername(String username) {
        return 0;
    }
}
