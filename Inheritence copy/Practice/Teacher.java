package com.Inheritence.Practice;

public class Teacher {
    String name;
    String subject;
    int salary;


    public Teacher(String name,String subject,int salary) {
        this.name = name;
        this.subject=subject;
        this.salary=salary;
    }

    public void information(){
        System.out.println("Name"+name);
        System.out.println("Subject"+subject);
        System.out.println("Salary"+salary);
    }

    public void result(int mark){
        if(mark>45) System.out.println("Pass");
        else System.out.println("Fail");
    }
}
