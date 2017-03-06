package com.epam.creationalpatterns.prototype;

import com.epam.creationalpatterns.unit.Chassis;
import com.epam.creationalpatterns.unit.Engine;
import com.epam.creationalpatterns.unit.Gear;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alex on 3/5/2017.
 */
public class CarPrototype {
    private final static Logger logger = LoggerFactory.getLogger(CarPrototype.class);
    protected final Engine engine;
    protected final Gear gear;
    protected final Chassis chassis;

    protected CarPrototype(Engine engine, Gear gear, Chassis chassis) {
        this.engine = engine;
        this.gear = gear;
        this.chassis = chassis;
    }

    public CarPrototype clone() throws CloneNotSupportedException{
        return (CarPrototype) super.clone();
    }

    public void drive(){
        engine.start();
        logger.info("car is driving");
    }


    @Override
    public String toString() {
        return "Car with engine: " + engine + ", shift: " + gear + ", chassis" + chassis;
    }
}
