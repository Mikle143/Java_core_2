package ru.vdovinmb.javaCore2.homeWork5.Task2;

import java.util.ArrayList;
import java.util.List;

public class Chat2Runner {
    public static void main(String[] args) {
        List<Chat2> chat2List = new ArrayList<>();
        List<User> userList1 = new ArrayList<>();
        List<User> userList2 = new ArrayList<>();
        User user1 = new User(1, "Ivan", 25);
        User user2 = new User(2, "Maksim", 17);
        User user3 = new User(3, "Mary", 18);
        User user4 = new User(4, "Alex", 15);
        User user5 = new User(5, "Petr", 27);
        User user6 = new User(6, "Sveta", 12);

        userList1.add(user1);
        userList1.add(user2);
        userList1.add(user3);
        userList2.add(user4);
        userList2.add(user5);
        userList2.add(user6);

        Chat2 avto = new Chat2("avto", userList1);
        Chat2 moto = new Chat2("avto", userList2);

        chat2List.add(avto);
        chat2List.add(moto);

        System.out.println(Chat2.usersExtraction18Age(chat2List));
        System.out.println(Chat2.averageAge(chat2List));
    }
}
