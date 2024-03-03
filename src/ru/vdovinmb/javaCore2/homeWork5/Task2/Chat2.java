package ru.vdovinmb.javaCore2.homeWork5.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Chat2 {
    private String chatName;
    private List<User> userList;

    public Chat2(String chatName, List<User> userList) {
        this.chatName = chatName;
        this.userList = userList;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    static double averageAge(List<Chat2> chat2List) {  // считает средний возраст
        List<User> users = usersExtraction18Age(chat2List);
        ListIterator<User> userListIterator = users.listIterator();
        int sumAge = 0;     //сумма лет оставшихся участников
        while (userListIterator.hasNext()) {
            User user = userListIterator.next();
            sumAge += user.getAge();
        }
        return sumAge / users.size();
    }

    static List<User> usersExtraction18Age(List<Chat2> chat2List) { //извлекает участников старше 18 лет и помещает их в новый юзер лист
        List<User> userList1 = new ArrayList<>();
        ListIterator<Chat2> chatlistIterator = chat2List.listIterator();

        while (chatlistIterator.hasNext()) {  // сначала итерируемся по чатам в списке чатов
            Chat2 chat2 = chatlistIterator.next();
            userList1.addAll(chat2.userList); // и помещаем все списки пользователей в один юзер лист
        }
        ListIterator<User> userListIterator = userList1.listIterator();// теперь итерируемся по спискам пользователей и
        // удаляем всех, кто младше 18
        while (userListIterator.hasNext()) {
            User user = userListIterator.next();
            if (user.getAge() < 18) {
                userListIterator.remove();
            }
        }
        return userList1; //на выходе список пользователей старше 18
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chat2 chat2)) return false;
        return Objects.equals(chatName, chat2.chatName) && Objects.equals(userList, chat2.userList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatName, userList);
    }
}
