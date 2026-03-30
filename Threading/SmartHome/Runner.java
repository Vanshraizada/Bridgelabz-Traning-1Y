package com.MultiThread.SmartHome;

import com.Inheritence.School_System.Teacher;
import com.MultiThread.Prac.Thread1;
import com.MultiThread.Prac.Thread2;
import com.MultiThread.Prac.Thread3;

public class Runner {
    public static void main(String[] args) {
        DoorLock d=new DoorLock();
        LightControl l=new LightControl();
        SecurityCamera s=new SecurityCamera();
        TempSensor t=new TempSensor();

        d.setPriority(5);
        l.setPriority(5);
        s.setPriority(10);
        t.setPriority(7);

        s.start();
        l.start();
        d.start();
        t.start();
    }
}
