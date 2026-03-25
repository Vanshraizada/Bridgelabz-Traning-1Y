package com.Inheritence.School_System;

public class Staff extends Person{
    String dep;
    public Staff(String name,int age,String dep){
        super(name,age);
        this.dep=dep;
    }
    public void detail(){
        System.out.print("Staff ");
        super.detail();
        System.out.println("Staff Department: "+dep);
    }
}
