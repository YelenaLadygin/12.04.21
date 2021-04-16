package com.company;
import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

     MallRepo mall = new MallRepo("jdbc:sqlite:C:\\Users\\yelena\\MALL.db");

        mall.select("SELECT * FROM STORIES");
        System.out.println("=====================");

      //  mall.update("UPDATE CUSTOMER \n" +
              //  "SET NUMBEROFORDER =NUMBEROFORDER +1 \n" +
              //  "WHERE ID >0");
      //  System.out.println("=====================");

        ArrayList<Mall> stories = mall.getAllStories();

    }
}









