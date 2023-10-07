package com.example.rubiking;
import java.time.LocalTime;
import java.util.Calendar;

public class RentalItem {
    public enum VehicleType {
        BIKE, SKATEBOARD, SCOOTER
    }
    public String username;
    public VehicleType type;
    public LocalTime start_time;
    public LocalTime end_time;
    public int itemId;
    public String location;

}
