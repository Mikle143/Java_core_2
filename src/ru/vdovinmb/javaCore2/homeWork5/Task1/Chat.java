package ru.vdovinmb.javaCore2.homeWork5.Task1;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Chat {
    private String chatName;
    private Integer number;

    public Chat(String name, int number) {
        this.chatName = name;
        this.number = number;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getChatName() {
        return chatName;
    }

    public int getNumber() {
        return number;
    }

    public static List<Chat> del1000(List<Chat> chatList) {  //удаляет чаты с количеством участников < 1000
        ListIterator<Chat> listIterator = chatList.listIterator();
        while (listIterator.hasNext()) {
            Chat chat = listIterator.next();
            if (chat.number < 1000) {
                listIterator.remove();
            }
        }
        return chatList;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + chatName + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chat chat)) return false;
        return getNumber() == chat.getNumber() && Objects.equals(getChatName(), chat.getChatName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChatName(), getNumber());
    }
}
