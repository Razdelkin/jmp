package com.razdelkin.config;

import com.razdelkin.User;
import com.razdelkin.UserService;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Alex on 3/27/2017.
 */
@Configuration
@ConfigurationProperties(locations = "application.yml", prefix = "admin")
public class Config {

    private String firstName;
    private String lastName;

    @Bean
    public UserService userService(){
        UserService userService;
        if(firstName == null || lastName == null) {
            userService = new UserService();
        }
        else {
            User admin = new User();
            admin.setFirstName(firstName);
            admin.setLastName(lastName);
            userService = new UserService(admin);
        }
        return userService;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
