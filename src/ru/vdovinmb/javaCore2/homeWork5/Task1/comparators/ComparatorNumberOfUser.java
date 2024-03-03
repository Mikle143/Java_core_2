package ru.vdovinmb.javaCore2.homeWork5.Task1.comparators;

import ru.vdovinmb.javaCore2.homeWork5.Task1.Chat;

import java.util.Comparator;

public class ComparatorNumberOfUser implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        if (o1.getNumber() > o2.getNumber()) {
            return 1;
        } else if (o1.getNumber() < o2.getNumber()) {
            return -1;
        } else return o1.getChatName().compareTo(o2.getChatName());
    }
}
