package dev.skystone;

import java.util.List;

public class Solution {
    static List<Vehicle> vehicleList;
    public static void getVehicleList(){
        vehicleList = Storage.readFile();
    }

    public static void printVehicleBrandList(){
        vehicleList.forEach(vehicle -> {
            System.out.println(vehicle.getBrand());
        });
    } 
}