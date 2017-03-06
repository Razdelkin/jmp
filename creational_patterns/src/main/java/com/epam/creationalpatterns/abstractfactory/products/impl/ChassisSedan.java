package com.epam.creationalpatterns.abstractfactory.products.impl;

import com.epam.creationalpatterns.unit.Chassis;

/**
 * Created by Alex on 3/6/2017.
 */
public class ChassisSedan extends Chassis{
    public ChassisSedan(String chassisType) {
        super(chassisType);
    }
    public ChassisSedan(){
        this("sedan");
    }
}
