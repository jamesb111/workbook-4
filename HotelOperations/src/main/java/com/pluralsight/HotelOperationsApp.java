package com.pluralsight;

public class HotelOperationsApp {
    public static void main(String[] args) {
        Room ritzRoom101 = new Room(4, 1400.00, true, false);

        System.out.println("Room is not available: " + ritzRoom101.isOccupied());

        Reservation ritzRez = new Reservation("regular", 10, true);


    }
}
