package com.MultiThread.OnlineFood;

public class Runner {
    public static void main(String[] args) {
        EconomyDelivery ec=new EconomyDelivery(1,"ABC",5);
        ExpressDelivery ex=new ExpressDelivery(2,"XYZ",6);
        StanderdDelivery s=new StanderdDelivery(3,"TDF",7);

        Thread t1 = new Thread(ex);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(ec);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
    }
}
