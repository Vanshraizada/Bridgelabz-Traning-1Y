package com.Encapsulation.Vehicle_Rental_System;

public class Car extends Vehical implements Insurable {
    int day;
    public Car(String type,int num,double rate,int day){
        super(num,"Car",rate);
        this.day=day;
    }

    @Override
    public double calrentalCost() {
        return getrate()*day;
    }

    @Override
    public double calculateInsurance() {
        return getrate()*0.07;
    }
    @Override
    public void getInsuranceDetails() {
        System.out.println("Car insurance: 7%");
    }
}
