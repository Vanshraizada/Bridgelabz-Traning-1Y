package com.Encapsulation.Banking_System;

public abstract class BankAccount {
    private int AccNo;
    private String AccHolder;
    private double Bal;
    public BankAccount(int AccNo,String AccHolder,double Bal){
        this.AccNo=AccNo;
        this.AccHolder=AccHolder;
        this.Bal=Bal;
    }
    public void detail(){
        System.out.println("Account Holder: "+AccHolder);
        System.out.println("Account number: "+AccNo);
        System.out.println("Account Balance: "+Bal);
    }
    public void deposit(double amount){
        Bal+= amount;
        System.out.println("Deposited: " +amount);
    }
    public void withdraw(double amount){
        if(amount<=Bal){
            Bal -= amount;
            System.out.println("Withdrawn: " + amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public abstract double calInterest();
    public double getBal(){
        return Bal;
    }
    public void setBal(double Bal){
        this.Bal=Bal;
    }
}
