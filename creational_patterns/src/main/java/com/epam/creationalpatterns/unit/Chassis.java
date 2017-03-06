package com.epam.creationalpatterns.unit;

/**
 * Created by Alex on 3/5/2017.
 */
public class Chassis {

    public final String chassisType;

    public Chassis(String chassisType){

        if(chassisType.equals("SUV") || chassisType.equals("sedan") || chassisType.equals("hatchback")){
            this.chassisType = chassisType;
        }
        else{
            throw new IllegalArgumentException("Chassis type is not supported! chassisType=" + chassisType);
        }

    }

}
