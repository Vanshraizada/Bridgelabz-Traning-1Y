package com.Encapsulation.E_Commerce;


public abstract class Product {
    private String id;
    private String name;
    private double price;
    public Product(String id, String name, double price){
        this.name=name;
        this.id=id;
        this.price=price;
    }
    public abstract double calDiscount();

    public void displayProduct(){
        System.out.println("Product ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Price: " +price);
    }
    public String  getid(){
        return id;
    }
    public void setid(int productId){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
}
