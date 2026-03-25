package com.Inheritence.Online_Retail;

public class ShippedOrder extends Order{
    int trackNo;
    public ShippedOrder(int id,String date,int trackNo){
        super(id,date);
        this.trackNo=trackNo;
    }
    public void detail(){
        super.detail();
        System.out.println("Tracking Number is: "+trackNo);
    }
}
