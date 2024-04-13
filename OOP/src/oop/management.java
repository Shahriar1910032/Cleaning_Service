package oop;

public class management {
   public static void main(String[] args) {
       
   }
}

class Deliveries {
    String deliveryRoute;
    String deliveryStatus;
    String pickupTime;
    String pickupDate;
    String assignedDriver;

    public Deliveries(String deliveryRoute, String deliveryStatus, String pickupTime, String pickupDate, String assignedDriver) {
        this.deliveryRoute = deliveryRoute;
        this.deliveryStatus = deliveryStatus;
        this.pickupTime = pickupTime;
        this.pickupDate = pickupDate;
        this.assignedDriver = assignedDriver;
    }
}