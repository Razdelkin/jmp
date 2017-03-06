package com.epam.creationalpatterns.abstractfactory.products.impl;

import com.epam.creationalpatterns.unit.Chassis;

/**
 * Created by Alex on 3/6/2017.
 */
public class ChassisSUV extends Chassis{

    public ChassisSUV(String chassisType) {
        super(chassisType);
    }
    public ChassisSUV(){
        this("SUV");
    }
}
