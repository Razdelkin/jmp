package com.razdelkin.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Alex on 3/28/2017.
 */
public class ApplicationStartListener implements ApplicationListener<ApplicationStartedEvent>{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("app is starting");
        logger.info("app is starting");
    }

}
