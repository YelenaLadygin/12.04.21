package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.*;
@Getter
@Setter
@ToString
public class CarsRentalAgency {

    protected ArrayList<String> cars = new ArrayList<>();
    protected Stack<String> workers = new Stack<>();
    protected Queue<String> customers = new ArrayDeque<>();
    protected HashMap<String,Float> rentHourlyFee = new HashMap<>();
    float income ;

    public CarsRentalAgency() {
        cars.add("Picanto");
        cars.add("RIO");
        cars.add("Forte");
        cars.add("Sportage");
        cars.add("Optima");
        workers.add("Yosi");
        workers.add("Yelena");
        customers.add ("AA");
        customers.add ("BB");
        customers.add ("CC");
        rentHourlyFee.put("Picanto",15f);
        rentHourlyFee.put("RIO",20f);
        rentHourlyFee.put("Forte",25f);
        rentHourlyFee.put("Sportage",30f);
        rentHourlyFee.put("Optima",35f);
    }

    public  void rentACars () {
        if (customers.isEmpty()) {
            System.out.println("No customers waiting");
        } else if (workers.isEmpty()) {
            System.out.println("Sorry, all our workers are busy right now");
        } else if (cars.isEmpty()) {
            System.out.println("Sorry, we have no cars avalible right now");
        } else {
            String worker = workers.pop();
            String custom = customers.poll();
            String car = cars.get(0);
            cars.remove(0);
            float taarif = rentHourlyFee.get(car);
            Random number = new Random();
            int rentHours = number.nextInt(12) + 1;
            float rentPrice = taarif * rentHours;
            income = income + rentHours;
            System.out.println(String.format("The customer %s has rented the car %s for %d hours", custom, car, rentHours));
            workers.push(worker);
        }
    }
       public void returnACars ( String customer, String car){
           if (workers.isEmpty()) {
               System.out.println("Sorry, all our workers are busy right now");
           }else {
               String worker = workers.pop();
               cars.add(car);
               System.out.println(String.format("The customer %s has returned the car %s", customer,car));
               workers.push(worker);
           }
    }
}


