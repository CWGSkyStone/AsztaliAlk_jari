package dev.skystone;

import java.util.List;

public class Solution {
    static List<Vehicle> vehicleList;
    public static void getVehicleList(){
        vehicleList = Storage.readFile();
    }

    // public static void printVehicleBrandList(){
    //     vehicleList.forEach(vehicle -> {
    //         System.out.println(vehicle.getBrand());
    //     });
    // } 
    public static void printPetrolVehicleDetails(){
        System.out.println("Szit.hu 0824-es feladat: 1. feladat");
        vehicleList.forEach(v -> {
            if(v.fuel.equals("benzin")){
                System.out.printf("%s %s %d %s %d %s %s %n",v.getPlate(),v.getBrand(),v.getYear(),
                v.getFuel(),v.getPrice(),v.isClimate() ? "Van klíma" : "Nincs klíma",v.getPermitDate());
            };
        });
    }

}