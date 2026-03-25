package com.Encapsulation.Banking_System;

public class Main {
    public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount(8238273, "XYZ", 50000);
        SavingAccount s = new SavingAccount(3746738, "ABC", 60280);
        c.detail();
        c.deposit(6747);
        c.withdraw(6549);
        System.out.println(c.calInterest());
        System.out.println(c.calculateLoanEligibility());
        System.out.println("--------------");
        s.detail();
        s.deposit(6747);
        s.withdraw(6549);
        System.out.println(s.calInterest());
        System.out.println(s.calculateLoanEligibility());
        System.out.println("--------------");

    }
}
