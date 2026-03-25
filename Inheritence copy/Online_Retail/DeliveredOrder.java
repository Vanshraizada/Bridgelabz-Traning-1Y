package com.Inheritence.Online_Retail;

public class DeliveredOrder extends ShippedOrder {
    String shipOrd;
    String ShipDate;

    public DeliveredOrder(int id, String date, int trackNo, String shipOrd, String ShipDate) {
        super(id, date, trackNo);
        this.ShipDate = ShipDate;
        this.shipOrd = shipOrd;
    }

    @Override
    public void detail() {
        super.detail();
        System.out.println("Order Update: "+shipOrd);
        System.out.println("Order delivery date: "+ShipDate);
    }
}