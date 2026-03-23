package dev.skystone;

import java.time.LocalDate;
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
            if(v.getFuel().equals("benzin")){
                System.out.printf("%s %s %d %s %d %s %s %n",v.getPlate(),v.getBrand(),v.getYear(),
                v.getFuel(),v.getPrice(),v.isClimate() ? "Van klíma" : "Nincs klíma",v.getPermitDate());
            };
        });
    }
    public static void printCheaperThan_OneMillion(){
        //Esetlegesen az eldöntés tétel.

        System.out.println("\n" + "Szit.hu 0824-es feladat: 2. feladat");
        vehicleList.forEach(v -> {
            if(v.getPrice() < 1e6){
                System.out.printf("%s %s %d %s %d %s %s %n",v.getPlate(),v.getBrand(),v.getYear(),
                v.getFuel(),v.getPrice(),v.isClimate() ? "Van klíma" : "Nincs klíma",v.getPermitDate());
            };
        });
    }
    public static void printPermitDate_MoreThan_OneYear(){
        System.out.println("\n" + "Szit.hu 0824-es feladat: 3. feladat");
        vehicleList.forEach(v -> {
            if(v.getPermitDate().isAfter(LocalDate.now().plusYears(1))){
                System.out.printf("%s %s %d %s %d %s %s %n",v.getPlate(),v.getBrand(),v.getYear(),
                v.getFuel(),v.getPrice(),v.isClimate() ? "Van klíma" : "Nincs klíma",v.getPermitDate());
            };
        });
    }
    public static void printHondaDetails(){
        System.out.println("\n" + "Szit.hu 0824-es feladat: 4. feladat");
        vehicleList.forEach(v -> {
            if(v.getBrand().equals("Honda")){
                System.out.printf("%s %s %d %s %d %s %s %n",v.getPlate(),v.getBrand(),v.getYear(),
                v.getFuel(),v.getPrice(),v.isClimate() ? "Van klíma" : "Nincs klíma",v.getPermitDate());
            };
        });
    }

}