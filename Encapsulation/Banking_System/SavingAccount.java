package com.Encapsulation.Banking_System;

public class SavingAccount extends BankAccount implements Lonable{
    public SavingAccount(int AccNo, String AccHolder, double Bal){
        super(AccNo, AccHolder, Bal);
    }
    public double calInterest(){
        return getBal() * 0.04;
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
