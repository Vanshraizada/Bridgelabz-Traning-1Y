package com.Encapsulation.Vehicle_Rental_System;

public class Main {
    public static void main(String[] args) {
        Bike b=new Bike("Bike",5567,5400,7);
        Car c=new Car("Car",6868,6500,7);
        Truck t=new Truck("Truck",7654,8000,7);
        b.getInsuranceDetails();
        System.out.println(b.calrentalCost());
        b.detail();
        System.out.println("---------------------");
        c.getInsuranceDetails();
        System.out.println(c.calrentalCost());
        c.detail();
        System.out.println("---------------------");
        t.getInsuranceDetails();
        System.out.println(t.calrentalCost());
        t.detail();
    }
}
