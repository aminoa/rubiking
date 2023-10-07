package com.example.rubiking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

// Class with the details of the rental item
public class RentalItem {
    public enum VehicleType {
        BIKE, SKATEBOARD, ESCOOTER
    }
    
    // User Details
    private final String username;

    // Vehicle Details
    private VehicleType type;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String location;
    private boolean availabile;

    // Constructor for rental creation
    RentalItem(String username, VehicleType type, LocalDate date, LocalTime startTime, LocalTime endTime, String location) {
        this.username = username;
        this.type = type;
        this.startTime = startTime;
        this.date = date;
        this.endTime = endTime;
        this.location = location;
        this.availabile = true;
    }

    // Returns the string with the username
    String getName() {
        return username;
    }

    // Returns the string with the type of vehicle
    String getType() {
        String vehicleType = "Type: ";

        switch (type) {
            case BIKE:
                vehicleType += "Bicycle";
                break;
            case SKATEBOARD:
                vehicleType += "SkateBoard";
                break;
            case ESCOOTER:
                vehicleType += "Electronic Scooter";
                break;
        }

        return vehicleType;
    }

    // Returns the string with the time
    String getTime() {
        String dateTime = "Time: ";

        // Adds the month and the day
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("LLL dd");
        dateTime += date.format(formatter) + ", ";

        // Adds the start time and the end time
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
        dateTime += startTime.format(timeFormat) + " to " + endTime.format(timeFormat);

        return dateTime;
    }

    // Returns the string with the location
    String getLocation() {
        return location;
    }

    public static void main(String[] args) {
        RentalItem bike1 = new RentalItem("Darsh", VehicleType.BIKE, LocalDate.now(), LocalTime.of(14, 0), LocalTime.of(16, 30), "Livi Student Center");

        System.out.println(bike1.getName());
        System.out.println(bike1.getType());
        System.out.println(bike1.getTime());
        System.out.println(bike1.getLocation());
    }
}
