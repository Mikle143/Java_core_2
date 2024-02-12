package ru.vdovinmb.javaCore2.homeWork1.House;

import java.util.Arrays;
import java.util.Objects;

public class Flat {
    private final int flatNumber;
    private final Room[] rooms;

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        //return "номер квартиры=" + flatNumber + ", комнаты:" + Arrays.toString(rooms); //здесь подробнее расписано, какие комнаты
        return "номер квартиры: " + flatNumber + ", количество комнат:" + rooms.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flat flat)) return false;
        return flatNumber == flat.flatNumber && Arrays.equals(rooms, flat.rooms);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(flatNumber);
        result = 31 * result + Arrays.hashCode(rooms);
        return result;
    }

    public void print() {
        System.out.println(toString());
    }
}
