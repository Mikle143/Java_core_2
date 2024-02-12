package ru.vdovinmb.javaCore2.homeWork1.House;

import java.util.Arrays;
import java.util.Objects;

public class Floor {
    private final int floorNumber;
    private final Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    @Override
    public String toString() {
        // return  "этаж: " + floorNumber + ", квартиры: " + Arrays.toString(flats);//здесь подробнее расписано, какие квартиры на этаже
        return "номер этажа: " + floorNumber + ", количество квартир: " + flats.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Floor floor)) return false;
        return floorNumber == floor.floorNumber && Arrays.equals(flats, floor.flats);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(floorNumber);
        result = 31 * result + Arrays.hashCode(flats);
        return result;
    }

    public void print() {
        System.out.println(toString());
    }
}
