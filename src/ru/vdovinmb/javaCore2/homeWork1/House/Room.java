package ru.vdovinmb.javaCore2.homeWork1.House;

import java.util.Objects;

public class Room {
    private final boolean isEntrance;

    public Room(boolean isEntrance) {
        this.isEntrance = isEntrance;
    }

    @Override
    public String toString() {
        return isEntrance ? "проходная" : "непроходная";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return isEntrance == room.isEntrance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEntrance);
    }

    public void print() {
        toString();
    }
}
