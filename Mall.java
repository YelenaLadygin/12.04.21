package com.company;

public class Mall {
    public int ID;
    public String name ;
    public int floor ;
    public int isReustarant ;
    public int isOpenLate;
    public int isLarge ;

    public Mall() {
    }

    public Mall(int ID, String name, int floor, int isReustarant, int isOpenLate, int isLarge) {
        this.ID = ID;
        this.name = name;
        this.floor = floor;
        this.isReustarant = isReustarant;
        this.isOpenLate = isOpenLate;
        this.isLarge = isLarge;
    }
}


