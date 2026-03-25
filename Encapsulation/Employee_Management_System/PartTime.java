package com.Encapsulation.Employee_Management_System;

public class PartTime extends Employee{
    private double rate;
    private double hour;
    private String dep;
    public PartTime(String name, int id, int salary, double rate, double hour,String dep) {
        super(name, id, 0);
        this.dep=dep;
        this.rate = rate;
        this.hour = hour;
    }
    public void dep(){
        System.out.println("Department: "+dep);
    }
    @Override
    public double cal() {
        return hour*rate;
    }
}
