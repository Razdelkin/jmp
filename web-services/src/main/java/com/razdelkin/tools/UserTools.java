package com.razdelkin.tools;

import com.razdelkin.User;

import java.util.Random;

/**
 * Created by Alex on 3/29/2017.
 */
public class UserTools {

    private static final String [] RANDOM_FIRST_NAMES = {"John","Jimmy", "Jack", "Patrick"};
    private static final String [] RANDOM_LAST_NAMES = {"Smith", "Hendrix", "Daniels", "Star"};
    private static Random rand = new Random();

    public static User createRandomUserBean(){
        User user = new User();
        user.setFirstName(RANDOM_FIRST_NAMES[rand.nextInt(RANDOM_FIRST_NAMES.length)]);
        user.setLastName(RANDOM_LAST_NAMES[rand.nextInt(RANDOM_LAST_NAMES.length)]);
        return user;
    }

}
