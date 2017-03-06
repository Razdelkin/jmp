package com.epam.creationalpatterns.abstractfactory;

import com.epam.creationalpatterns.unit.Chassis;
import com.epam.creationalpatterns.unit.Engine;
import com.epam.creationalpatterns.unit.Gear;

/**
 * Created by Alex on 3/6/2017.
 */
public abstract class AbstractChassisFactory {
    public abstract Chassis createChassis();
}
