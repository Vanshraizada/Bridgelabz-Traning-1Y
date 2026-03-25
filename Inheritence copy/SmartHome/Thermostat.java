package com.Inheritence.SmartHome;

public class Thermostat extends Device{
    double tempset;
    public Thermostat(String id,String status,double tempset){
        super(id,status);
        this.tempset=tempset;
    }
    public void detail(){
        super.detail();
        System.out.println("Temperature Setting is: "+tempset+" C");
    }
}
