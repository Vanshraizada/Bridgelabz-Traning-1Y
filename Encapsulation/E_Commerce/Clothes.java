package com.Encapsulation.E_Commerce;

public class Clothes extends Product{
    public Clothes(String name,String id, double price){
        super(id, name, price);
    }

    @Override
    public double calDiscount() {
        return getPrice()*0.10;
    }
    public double calTax(){
        return getPrice()*0.10;
    }
    public void getTaxDetail(){
        System.out.println("Clothes Tax: 10%");
        double p = getPrice();
        double d = calDiscount();
        double t = calTax();
        double f = p + t - d;
        System.out.println("Final Price is: " + f);
    }

}
