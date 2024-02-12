package ru.vdovinmb.javaCore2.homeWork1.House;

import java.util.Arrays;
import java.util.Objects;

public class House {

    private final int houseNumber;
    private final Floor[] floors;

    public House(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "номер дома: " + houseNumber + ", этажи: " + Arrays.toString(floors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House house)) return false;
        return houseNumber == house.houseNumber && Arrays.equals(floors, house.floors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(houseNumber);
        result = 31 * result + Arrays.hashCode(floors);
        return result;
    }

    public void print() {
        System.out.println(toString());
    }
}
