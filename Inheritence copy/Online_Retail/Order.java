package com.Inheritence.Online_Retail;

public class Order {
    int id;
    String date;
    public Order(int id, String date){
        this.id=id;
        this.date=date;
    }


    public void detail(){
        System.out.println("Order Id: "+id);
        System.out.println("Order date: "+date);
    }
}
