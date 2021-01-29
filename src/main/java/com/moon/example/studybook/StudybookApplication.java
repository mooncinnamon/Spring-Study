package com.moon.example.studybook;

import com.moon.example.studybook.service.UserSerivce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StudybookApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();

        UserSerivce userSerivce1 = context.getBean(UserSerivce.class);
        UserSerivce userSerivce2 = context.getBean("userService", UserSerivce.class);
        UserSerivce userSerivce3 = (UserSerivce) context.getBean("userService");

        SpringApplication.run(StudybookApplication.class, args);
    }

}
