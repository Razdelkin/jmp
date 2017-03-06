package com.epam.creationalpatterns.factorymethod;

import com.epam.creationalpatterns.unit.Chassis;
import com.epam.creationalpatterns.unit.Engine;
import com.epam.creationalpatterns.unit.Gear;

/**
 * Created by Alex on 3/6/2017.
 */
public class SuvCar extends Car {

    protected SuvCar() {
        super();
        setChassis(new Chassis("SUV"));
        setEngine(new Engine(2.0F));
        setGear(new Gear("AT"));
    }
}
