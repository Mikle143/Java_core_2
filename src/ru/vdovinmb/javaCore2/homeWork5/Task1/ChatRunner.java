package ru.vdovinmb.javaCore2.homeWork5.Task1;

import ru.vdovinmb.javaCore2.homeWork5.Task1.comparators.ComparatorNameOfChat;
import ru.vdovinmb.javaCore2.homeWork5.Task1.comparators.ComparatorNumberOfUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatRunner {
    public static void main(String[] args) {
        List<Chat> chatList = new ArrayList<>();
        Chat avto = new Chat("avto", 1200);
        Chat moto = new Chat("moto", 900);
        Chat java = new Chat("java", 1200);
        Chat velo = new Chat("velo", 800);
        Chat zoo = new Chat("zoo", 1400);

        chatList.add(zoo);
        chatList.add(avto);
        chatList.add(moto);
        chatList.add(java);
        chatList.add(velo);

        Chat.del1000(chatList);
        for (Chat chat : chatList) {
            System.out.println(chat);
        }

        System.out.println();

        ComparatorNumberOfUser comparatorNumberOfUser = new ComparatorNumberOfUser(); // компаратор по количеству пользователей
        Collections.sort(chatList, comparatorNumberOfUser);
        for (Chat chat : chatList) {
            System.out.println(chat);
        }

        System.out.println();

        ComparatorNameOfChat comparatorNameOfChat = new ComparatorNameOfChat(); //компаратор по названию чата
        Collections.sort(chatList, comparatorNameOfChat);
        Collections.sort(chatList, comparatorNumberOfUser);
        for (Chat chat : chatList) {
            System.out.println(chat);
        }

    }
}
