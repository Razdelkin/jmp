package com.razdelkin;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 3/18/2017.
 */
@Service
public class UserService {


    public UserService(){    }

    private Map<Integer, User> userContainer = new HashMap<>();


    public User getUser(int id){
        return userContainer.get(id);
    }

    public Collection<User> list(){
        return userContainer.values();
    }

    public void deleteUser(int id){
        userContainer.remove(id);
    }
    public User updateUser(User user){
        return createUser(user);
    }

    public User createUser(User user){
        userContainer.put(user.getId(), user);
        return user;
    }




}
