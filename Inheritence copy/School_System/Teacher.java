package com.Inheritence.School_System;

import java.security.SecureRandom;

public class Teacher extends Person{
    String subject;
    public Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    public void detail(){
        System.out.print("Teacher ");
        super.detail();
        System.out.println("Subject: "+subject);
    }
}
