package com.epam.creationalpatterns.factorymethod;

import com.epam.creationalpatterns.unit.Chassis;
import com.epam.creationalpatterns.unit.Engine;
import com.epam.creationalpatterns.unit.Gear;

/**
 * Created by Alex on 3/6/2017.
 */
public class SedanCar extends Car {
    public SedanCar(){
        setEngine(new Engine(1.6F));
        setGear(new Gear("AT"));
        setChassis(new Chassis("sedan"));
    }
}
