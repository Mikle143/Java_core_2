package ru.vdovinmb.javaCore2.homeWork6;

import java.util.Comparator;

public class ComparatorRating implements Comparator<Film> {

    @Override
    public int compare(Film o1, Film o2) {
        if (o1.getRating() - o2.getRating() < 0) {
            return 1;
        } else if (o1.getRating() - o2.getRating() > 0) {
            return -1;
        } else return 0;


    }
}
