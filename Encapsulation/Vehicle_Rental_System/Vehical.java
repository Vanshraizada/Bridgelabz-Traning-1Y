package com.Encapsulation.Vehicle_Rental_System;

public abstract class Vehical {
    private int num;
    private String type;
    private double rate;
    public Vehical(int num, String type,double rate){
        this.num=num;
        this.type=type;
        this.rate=rate;
    }

    public abstract double calrentalCost();

    public void detail(){
        System.out.println("Vehical Number: "+num);
        System.out.println("Vehical Type: "+type);
        System.out.println("Vehical rate per day: "+rate);
    }
    public int getnum(){
        return num;
    }
    public void setnum(int num){
        this.num=num;
    }
    public String gettype(){
        return type;
    }
    public void settype(String type){
        this.type=type;
    }
    public double getrate(){
        return rate;
    }
    public void setrate(double rate){
        this.rate=rate;
    }
}
