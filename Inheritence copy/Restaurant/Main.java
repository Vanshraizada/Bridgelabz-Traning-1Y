package com.Inheritence.Restaurant;

public class Main {
    public static void main(String[] args) {
        Chef c=new Chef("XYZ",21,"Food making");
        c.performDuties();
        System.out.println("==================================");
        Waiter x=new Waiter("ABCD",12,"Food Serving");
        x.performDuties();

    }
}
