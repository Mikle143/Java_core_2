package ru.vdovinmb.javaCore2.homeWork6;

import java.util.Map;
import java.util.Set;

public class Cinema {
    private Map<Integer, Set<Film>> cinemaMap;

    public Cinema(Map<Integer, Set<Film>> cinema) {
        this.cinemaMap = cinema;
    }

    public Map<Integer, Set<Film>> getCinemaMap() {
        return cinemaMap;
    }

    public void setCinemaMap(Map<Integer, Set<Film>> cinemaMap) {
        this.cinemaMap = cinemaMap;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cinemaMap=" + cinemaMap +
                '}';
    }
}


