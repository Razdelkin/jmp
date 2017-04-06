package com.razdelkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Alex on 3/17/2017.
 *
 *
 * you can use this json object to test(past this to PUT and then you can youse GET, UPDATE, LIST, or DELETE )
 *  {  "firstName": "SFBDGNHJYK,JMTHNRGBFVBGRNHTMJY",
        "lastName": "asfgsfhgjtkyjthgdfsd",
        "email": null,
        "phone": "88005553535",
        "city": "adgsfshdgfjhfklfyudtyjrsthaegFDAGEHTSRYJTKUIYLKUJYRSHTEGFS",
        "street": "AGSEHYJRUK",
        "house": null
    }
 *
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    //common part again /user/
    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable int userId){
        return userService.getUser(userId);
    }

    @GetMapping("/user/all")
    public Collection<User> list(){
        return userService.list();
    }

    @PutMapping("/user/")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping("/user/")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
    }

    @PostMapping("/user/")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


    //getters & setters
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
