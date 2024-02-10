package ru.vdovinmb.javaCore2.homeWork1.House;

import java.util.Arrays;

public class House {

    private int houseNumber;
    private Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "номер дома: " + houseNumber + ", этажи: " + Arrays.toString(floors);
    }

    public void print() {
        System.out.println(toString());
    }
}
