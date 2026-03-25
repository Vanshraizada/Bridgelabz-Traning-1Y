package com.Encapsulation.E_Commerce;

public class Main {
    public static void main(String[] args) {
        Clothes c=new Clothes("Shirt","#3234",500);
        c.displayProduct();
        c.getTaxDetail();
        System.out.println("------------------------");
        Electronic e=new Electronic("Smart Phone","#7323",45300);
        e.displayProduct();
        e.getTaxDetails();
        System.out.println("------------------------");
        Groceries g=new Groceries("Rice","/32//3",300);
        g.displayProduct();
        g.getTaxDetail();
    }
}
