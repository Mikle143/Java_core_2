package ru.vdovinmb.javaCore2.homeWork1.House;

public class Room {
    private boolean isEntrance;

    public Room(boolean isEntrance) {
        this.isEntrance = isEntrance;
    }

    @Override
    public String toString() {
        if (isEntrance == true) {
            return "проходная";
        } else {
            return "непроходная";
        }
    }

    public void print() {
        toString();
    }
}
