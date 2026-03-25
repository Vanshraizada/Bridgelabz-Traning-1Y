package com.Encapsulation.Employee_Management_System;

public class main {
    public static void main(String[] args) {
        PartTime p=new PartTime("XYZ",123,4500,400,3,"IT");
        p.dep();
        System.out.println(p.cal());
        FullTime f=new FullTime("Esa",43,45000,"Support");
        f.dep();
        System.out.println(f.cal());


    }
}
