package com.epam.creationalpatterns.unit;

/**
 * Created by Alex on 3/5/2017.
 */
public class Gear {

    public final String gearType;

    public Gear(String gearType){

        if(gearType.equals("MT") || gearType.equals("AT")){
            this.gearType = gearType;
        }
        else{
            throw new IllegalArgumentException("Gear type is not supported! gearType=" + gearType);
        }
    }

    public void decrement(){

    }

    public void increment(){

    }

}
