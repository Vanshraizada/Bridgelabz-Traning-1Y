package com.Encapsulation.Vehicle_Rental_System;

public class Bike extends Vehical implements Insurable {
    int day;
    public Bike(String type,int num,double rate,int day){
        super(num,"Bike",rate);
        this.day=day;
    }

    @Override
    public double calrentalCost() {
        return getrate()*day;
    }

    @Override
    public double calculateInsurance() {
        return getrate()*0.05;
    }
    @Override
    public void getInsuranceDetails() {
        System.out.println("Bike insurance: 5%");
    }
}
