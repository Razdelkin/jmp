package com.epam.creationalpatterns.prototype;

import com.epam.creationalpatterns.unit.Chassis;
import com.epam.creationalpatterns.unit.Engine;
import com.epam.creationalpatterns.unit.Gear;

/**
 * Created by Alex on 3/5/2017.
 */
public class SuvCarPrototype extends CarPrototype implements Cloneable{

    Engine engine = new Engine(2.0F);
    Gear gear = new Gear("MT");
    Chassis chassis = new Chassis("SUV");


    public SuvCarPrototype(Engine engine, Gear gear, Chassis chassis) {
        super(engine, gear, chassis);
    }
    @Override
    public CarPrototype clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
