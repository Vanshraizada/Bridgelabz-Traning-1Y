package com.Inheritence.Restaurant;

public class Waiter extends Person implements work{
    String dut;
    public Waiter(String name,int id,String dut){
        super(name,id);
        this.dut=dut;
    }
    public void performDuties(){
        System.out.print("Waiter ");
        super.detail();
        System.out.println("Duties: "+dut);
    }
}
