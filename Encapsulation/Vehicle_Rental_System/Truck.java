package com.Encapsulation.Vehicle_Rental_System;

public class Truck extends Vehical implements Insurable {
    int day;
    public Truck(String type,int num,double rate,int day){
        super(num,"Truck",rate);
        this.day=day;
    }

    @Override
    public double calrentalCost() {
        return getrate()*day;
    }

    @Override
    public double calculateInsurance() {
        return getrate()*0.1;
    }
    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck insurance: 10%");
    }
}
