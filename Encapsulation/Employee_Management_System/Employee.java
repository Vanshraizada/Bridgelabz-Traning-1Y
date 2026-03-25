package com.Encapsulation.Employee_Management_System;

public abstract class Employee {
    private String  name;
    private int salary;
    private int id;
    private String department;

    public Employee(String  name,int salary,int id){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public abstract double cal();
    public void detail(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);
    }
    public int getsalary(){
        return salary;
    }
    public void setsalary(int salary){
        this.salary=salary;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setid(int id){
        this.id=id;
    }

}
