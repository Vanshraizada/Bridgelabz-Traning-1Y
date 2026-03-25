package com.Inheritence.Restaurant;

public class Chef extends Person implements work{
    String dut;
    public Chef(String name,int id,String dut){
        super(name,id);
        this.dut=dut;
    }
    public void performDuties(){
        System.out.print("Chef ");
        super.detail();
        System.out.println("Duties: "+dut);
    }
}
