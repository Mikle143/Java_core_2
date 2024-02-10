package ru.vdovinmb.javaCore2.homeWork1.House;

import java.util.Arrays;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    @Override
    public String toString() {
        // return  "этаж: " + floorNumber + ", квартиры: " + Arrays.toString(flats);//здесь подробнее расписано, какие квартиры на этаже
        return "номер этажа: " + floorNumber + ", количество квартир: " + flats.length;
    }

    public void print() {
        System.out.println(toString());
    }
}
