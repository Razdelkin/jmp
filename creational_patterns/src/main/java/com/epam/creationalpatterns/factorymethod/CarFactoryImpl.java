package com.epam.creationalpatterns.factorymethod;

/**
 * Created by Alex on 3/6/2017.
 */
public class CarFactoryImpl implements CarFactory{

    public CarFactoryImpl() {

    }

    @Override
    public Car createCar(String carType) {
        if(carType.equals("SUV")){
            return new SuvCar();
        }

        else if (carType.equals("sedan")){
            return new SedanCar();
        }
        else{
            throw new IllegalArgumentException("There's no such car type");
        }
    }
}
