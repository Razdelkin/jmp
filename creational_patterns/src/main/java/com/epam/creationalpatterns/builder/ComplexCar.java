package com.epam.creationalpatterns.builder;

import com.epam.creationalpatterns.factorymethod.Car;

import java.util.Date;

/**
 * Created by Alex on 3/6/2017.
 */
public class ComplexCar extends Car{
    private final String name;

    public String getName() {
        return name;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public String getVin() {
        return vin;
    }

    public String getAnotherLongProperty() {
        return anotherLongProperty;
    }

    public String getYetAnotherLongProperty() {
        return yetAnotherLongProperty;
    }

    private final Date dateOfProduction;
    private final String vendorName;
    private final String vendorCode;
    private final String vin;
    private final String anotherLongProperty;
    private final String yetAnotherLongProperty;

    public ComplexCar(String name, Date dateOfProduction, String vendorName, String vendorCode, String vin, String anotherLongProperty, String yetAnotherLongProperty) {
        this.name = name;
        this.dateOfProduction = dateOfProduction;
        this.vendorName = vendorName;
        this.vendorCode = vendorCode;
        this.vin = vin;
        this.anotherLongProperty = anotherLongProperty;
        this.yetAnotherLongProperty = yetAnotherLongProperty;
    }

    public static class ComplexCarBuilder{
        String innerName;
        Date innerDateOfProduction;
        String innerVendorName;
        String innerVendorCode;
        String innerVin;
        String innerAnotherLongProperty;
        String innerYetAnotherLongProperty;

        public ComplexCarBuilder setName(String name){
            this.innerName = name;
            return this;
        }
        public ComplexCarBuilder setDate(Date date){
            this.innerDateOfProduction = date;
            return this;
        }

        public ComplexCarBuilder setVendorName(String vendorName){
            this.innerVendorName = vendorName;
            return this;
        }

        public ComplexCarBuilder setVendorCode(String vendorCode){
            this.innerVendorCode = vendorCode;
            return this;
        }

        public ComplexCarBuilder setVin(String vin){
            this.innerVin = vin;
            return this;
        }

        public ComplexCarBuilder setAnotherLongProperty(String anotherLongProperty){
            this.innerAnotherLongProperty = anotherLongProperty;
            return this;
        }

        public ComplexCarBuilder setetAnotherLongProperty(String yetAnotherLongProperty){
            this.innerYetAnotherLongProperty = yetAnotherLongProperty;
            return this;
        }
        public ComplexCar build(){
            return new ComplexCar(
                    innerName, innerDateOfProduction, innerVendorName, innerVendorCode,
                    innerVin, innerAnotherLongProperty,innerYetAnotherLongProperty
            );
        }

    }

}
