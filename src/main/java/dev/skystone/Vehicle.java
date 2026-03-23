package dev.skystone;

import java.time.LocalDate;

public class Vehicle {
    String plate;
    String brand;
    int year;
    String fuel;
    int price;
    boolean climate;
    LocalDate permitDate;
    
    public Vehicle() {}
    public Vehicle(String plate, String brand, int year, String fuel, int price, boolean climate,
            LocalDate permitDate) {
        this.plate = plate;
        this.brand = brand;
        this.year = year;
        this.fuel = fuel;
        this.price = price;
        this.climate = climate;
        this.permitDate = permitDate;
    }
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isClimate() {
        return climate;
    }
    public void setClimate(boolean climate) {
        this.climate = climate;
    }
    public LocalDate getPermitDate() {
        return permitDate;
    }
    public void setPermitDate(LocalDate permitDate) {
        this.permitDate = permitDate;
    }
    
}
