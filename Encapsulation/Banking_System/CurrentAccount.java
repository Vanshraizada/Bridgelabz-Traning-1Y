package com.Encapsulation.Banking_System;

public class CurrentAccount extends  BankAccount implements Lonable {
    public CurrentAccount(int AccNo, String AccHolder, double Bal){
        super(AccNo, AccHolder, Bal);
    }
    public double calInterest(){
        return getBal() * 0.06;
    }
    public void applyForLoan(double amt){
        if(calculateLoanEligibility()){
            System.out.println("Loan approved: " +amt);
        }else{
            System.out.println("Loan not approved");
        }
    }
    @Override
    public boolean calculateLoanEligibility(){
        return getBal()>5000;
    }
}
