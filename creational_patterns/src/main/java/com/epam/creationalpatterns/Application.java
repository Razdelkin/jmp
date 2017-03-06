package com.epam.creationalpatterns;

import com.epam.creationalpatterns.abstractfactory.AbstractChassisFactory;
import com.epam.creationalpatterns.abstractfactory.impl.ChassisSedanFactory;
import com.epam.creationalpatterns.abstractfactory.impl.ChassisSuvFactory;
import com.epam.creationalpatterns.builder.ComplexCar;
import com.epam.creationalpatterns.factorymethod.Car;
import com.epam.creationalpatterns.factorymethod.CarFactory;
import com.epam.creationalpatterns.factorymethod.CarFactoryImpl;
import com.epam.creationalpatterns.prototype.CarPrototype;
import com.epam.creationalpatterns.prototype.SuvCarPrototype;
import com.epam.creationalpatterns.unit.Chassis;
import com.epam.creationalpatterns.unit.Engine;
import com.epam.creationalpatterns.unit.Gear;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by Alex on 3/5/2017.
 */
public class Application {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    private Application() {

    }

    private static class SingletonHolder {
        private static final Application instance = new Application();
    }

    public static Application getInstance() {
        return SingletonHolder.instance;
    }

    void start(String mode) {
        logger.info("Application.start()");
        if (mode.equals("prototype")) {
            logger.info("Running prototype...");
            SuvCarPrototype suvCar = new SuvCarPrototype(new Engine(2.0F), new Gear("MT"), new Chassis("SUV"));
            CarPrototype anotherSuvCar;
            try {
                anotherSuvCar = suvCar.clone();
                anotherSuvCar.drive();

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        else if(mode.equals("factory_method")){
            logger.info("Running factory_method...");
            CarFactory carFactory = new CarFactoryImpl();
            Car sedanCar = carFactory.createCar("sedan");
            Car suvCar = carFactory.createCar("SUV");
            sedanCar.drive();
            suvCar.drive();
        }
        else if(mode.equals("abstract_factory")){
            logger.info("Running abstract_factory...");
            logger.info("runing sedan chassis");
            AbstractChassisFactory sedanChassisFactory = new ChassisSedanFactory();
            Chassis sedanChassis = sedanChassisFactory.createChassis();
            logger.info("runing suv chassis");
            AbstractChassisFactory suvChassisFactory = new ChassisSuvFactory();
            Chassis suvChassis = suvChassisFactory.createChassis();
        }
        else if(mode.equals("builder")){
            ComplexCar complexCar = new ComplexCar.ComplexCarBuilder()
                    .setName("name")
                    .setDate(new Date())
                    .setAnotherLongProperty("adfs")
                    .build();
            logger.info("car name is " + complexCar.getName());
        }
    }

    void exit(int errorCode) {
        logger.info("Exititng with code:" + errorCode);
        System.exit(errorCode);
    }

    void exit() {
        exit(0);
    }

}
