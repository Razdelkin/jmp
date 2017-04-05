package com.razdelkin.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Alex on 3/28/2017.
 */
@Component
public class ApplicationReadyEventListener {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @EventListener
    public void handleAppReady(ApplicationReadyEvent event){
        logger.info("app is ready");

    }
}
