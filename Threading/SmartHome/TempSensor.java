package com.MultiThread.SmartHome;

public class TempSensor extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Temperature: " + (28 + i));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
