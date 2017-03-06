package com.epam.creationalpatterns.abstractfactory.impl;

import com.epam.creationalpatterns.abstractfactory.AbstractChassisFactory;
import com.epam.creationalpatterns.abstractfactory.products.impl.ChassisSedan;
import com.epam.creationalpatterns.unit.Chassis;

/**
 * Created by Alex on 3/6/2017.
 */
public class ChassisSedanFactory extends AbstractChassisFactory{

    @Override
    public Chassis createChassis() {
        return new ChassisSedan();
    }
}
