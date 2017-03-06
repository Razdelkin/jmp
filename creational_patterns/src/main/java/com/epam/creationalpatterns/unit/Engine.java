package com.epam.creationalpatterns.unit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alex on 3/5/2017.
 */
public class Engine {

    public final float volume;

    private static final Logger logger = LoggerFactory.getLogger(Engine.class);

    public Engine(float volume){
        if(volume == 1.2f || volume == 1.6f || volume == 2.0f){
            this.volume = volume;
        }
        else{
            throw new IllegalArgumentException("Engine volume is not supported! volume=" + volume);
        }

    }

    public void start() {
        logger.info("Engine has been started");
    }

    public void stop(){

    }

}
