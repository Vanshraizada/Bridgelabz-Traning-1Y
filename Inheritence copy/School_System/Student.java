package com.Inheritence.School_System;

public class Student extends Person{
    char garde;
    public Student(String name,int age,char grade){
        super(name,age);
        this.garde=grade;
    }
    public void detail(){
        System.out.print("Student ");
        super.detail();
        System.out.println("Grade of the Student: "+garde);
    }
}
