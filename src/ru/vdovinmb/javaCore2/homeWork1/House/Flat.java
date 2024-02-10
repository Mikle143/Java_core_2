package ru.vdovinmb.javaCore2.homeWork1.House;

import java.util.Arrays;

public class Flat {
    private int flatNumber;
    private Room[] rooms;

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        //return "номер квартиры=" + flatNumber + ", комнаты:" + Arrays.toString(rooms); //здесь подробнее расписано, какие комнаты
        return "номер квартиры: " + flatNumber + ", количество комнат:" + rooms.length;
    }

    public void print() {
        System.out.println(toString());
    }
}
