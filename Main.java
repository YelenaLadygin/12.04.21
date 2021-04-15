package com.company;


public class Main {
    public static void main(String[] args) {
        CarsRentalAgency carAgency = new CarsRentalAgency();
        carAgency.cars.add("Picanto");
        carAgency.cars.add("RIO");
        carAgency.cars.add("Forte");
        carAgency.cars.add("Sportage");
        carAgency.cars.add("Optima");
        carAgency.workers.add ("Yosi");
        carAgency.workers.add ("Vasya");
        carAgency.workers.add ("Ivan");
        carAgency.customers.add ("AA");
        carAgency.customers.add ("BB");
        carAgency.customers.add ("CC");
        carAgency.rentHourlyFee.put("Picanto",15f);
        carAgency.rentHourlyFee.put("RIO",20f);
        carAgency.rentHourlyFee.put("Forte",25f);
        carAgency.rentHourlyFee.put("Sportage",30f);
        carAgency.rentHourlyFee.put("Optima",35f);

        carAgency.rentACars();
        carAgency.returnACars("BB","Forte");

        Building homeMaintance = new Building(25, true,false,500);
        homeMaintance.maintainceBuilding();
        homeMaintance.collectMoney();












    }
}
