package com.company;

public class Building {
    int number_of_residents ;
    boolean is_building_clean;
    boolean is_electricity_working;
    float cashbox ;

    public Building(int number_of_residents, boolean is_building_clean, boolean is_electricity_working, float cashbox) {
        this.number_of_residents = number_of_residents;
        this.is_building_clean = is_building_clean;
        this.is_electricity_working = is_electricity_working;
        this.cashbox = cashbox;
    }

    public boolean maintainceBuilding (){
        boolean maintanance = true;
        if (is_building_clean != true){
            boolean successFullyCleaned = callCleaner();
            if (successFullyCleaned ==false){
                maintanance = false;
            }
        }
        if (is_electricity_working!= true){
        }
    return maintanance;
    }

 public boolean callCleaner() {
     if (cashbox >= 100) {
         cashbox = cashbox - 100;
         is_building_clean = true;
         System.out.println("The bulding was cleaned");
     } else {
         System.out.println("There is no money");
         return false;
     }
     return true;
 }
     public boolean callElectrician() {
         if (cashbox >= 300) {
             cashbox = cashbox - 300;
             is_building_clean = true;
             System.out.println("The building was fixed");
         }
         else {
             System.out.println("There is no money");
             return false;
         }
         return true;
 }
     public float collectMoney () {
       cashbox = number_of_residents * 80 ;
       System.out.println(cashbox);
       return cashbox;
     }

}
