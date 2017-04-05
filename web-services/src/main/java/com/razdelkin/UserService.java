package com.razdelkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 3/18/2017.
 */
public class UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());



    public UserService(){    }


    /**
     *  just to test config properties
     *  I don't really see any point to inject admin user in service constructor in real projects
     */
    public UserService(User admin){
        createUser(admin);
    }


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
