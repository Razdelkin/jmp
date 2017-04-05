package com.razdelkin.tools;

import com.razdelkin.UserService;
import com.razdelkin.tools.UserTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Alex on 3/29/2017.
 */
@Component
public class UserLoader implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Loading users...");
        if(args.length>1){
            for(int i = 0; i < args.length; i++){
                if(args[i].equals("--addrandomuser") || args[i].equals("-u") ){
                    if(args.length> i+1 && args[i+1] != null){
                        int userNumber = 1;
                        try{
                            userNumber = Integer.parseInt(args[i+1]);
                        }
                        catch(NumberFormatException e){
                            logger.error("Wrong number format! Using 1 as number!");
                        }

                        for(int j = 0; j < userNumber; j++){
                            userService.createUser(UserTools.createRandomUserBean());
                        }

                        return;
                    }
                }
            }
        }
        logger.info("Complete.");
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}