package com.MultiThread.OnlineFood;

public class EconomyDelivery extends Order implements Runnable{
    public EconomyDelivery(int ordId,String restName,int dilTime){
        super(ordId,restName,dilTime);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(dilTime*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Order ID: "+ordId+"\nRestaurant name: "+restName+"\nDelivery time: "+dilTime);
    }
}

