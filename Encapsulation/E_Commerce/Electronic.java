package com.Encapsulation.E_Commerce;

public class Electronic extends Product{
    public Electronic(String name,String id, double price){
        super(id, name, price);
    }

    @Override
    public double calDiscount() {
        return getPrice()*0.10;
    }
    public double calTax(){
        return getPrice()*0.20;
    }
    public void getTaxDetails(){
        System.out.println("Electronics Tax: 20%");
        double p = getPrice();
        double d = calDiscount();
        double t = calTax();
        double f = p + t - d;
        System.out.println("Final Price is: " + f);
    }
}
