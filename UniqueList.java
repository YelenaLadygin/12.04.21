package com.company;

import java.util.*;

public class UniqueList {

     Set<Integer> numbers_list = new HashSet<>() ;

   public UniqueList() {
    numbers_list.add(34);
    numbers_list.add(12);
    numbers_list.add(44);
    numbers_list.add(7);
    numbers_list.add(99);
  }

    public boolean addNumbers(int number) {
        numbers_list.add(number);
        boolean res = false;
        try {
            if (number>0){
                res = true;
            }
            else if (number < 0) {
                res = false;
            }
            else {
                throw new Exception("hariga");
            }
        }
        catch (Exception e){
          System.out.println(e.getMessage());
        }
        return res;
    }
}
