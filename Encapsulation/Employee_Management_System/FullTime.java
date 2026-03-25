package com.Encapsulation.Employee_Management_System;

import javax.swing.plaf.DesktopPaneUI;
import java.security.PrivateKey;

public class FullTime extends Employee {
    private String dep;

   public FullTime(String name,int id,int salary,String dep){
       super(name, salary, id);
       this.dep=dep;
   }
   public void dep(){
       System.out.println("Department: "+dep);
   }

    @Override
    public double cal() {
        return getsalary();
    }
}
