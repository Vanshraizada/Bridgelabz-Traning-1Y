package com.Inheritence.SmartHome;

public class Device {
    String id;
    String status;
    public Device(String id, String status){
        this.id=id;
        this.status=status;
    }
    public void detail(){
        System.out.println("ID of Device: "+id);
        System.out.println("Status of Device: "+status);
    }


}
