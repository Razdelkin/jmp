package com.epam.creationalpatterns.factorymethod;

import com.epam.creationalpatterns.unit.Chassis;
import com.epam.creationalpatterns.unit.Engine;
import com.epam.creationalpatterns.unit.Gear;

/**
 * Created by Alex on 3/6/2017.
 */
public abstract class Car {
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    private Engine engine;
    private Gear gear;
    private Chassis chassis;


    protected Car() {
    }

    public void drive(){
        if(chassis != null && gear != null && engine != null){
            engine.start();
            gear.increment();
        }
        else{
            throw new IllegalStateException("car is not initialized properly");
        }

    }
}
