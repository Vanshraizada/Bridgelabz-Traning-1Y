package com.Inheritence.Practice;

public class Student extends Teacher {
    String sName;
    int rollnumber;

    public Student(String sName, int rollnumber,String name,String subject,int salary) {
        super(name,subject,salary);
        this.sName = sName;
        this.rollnumber = rollnumber;
    }
    public void info(){
        System.out.println("Name "+sName);
        System.out.println("Roll number "+rollnumber);
    }

    public static void main(String[] args) {
        Student s=new Student("Sachin",55,"Veyr","Java",800);
        s.info();
        s.result(67);
        s.information();

    }
}
