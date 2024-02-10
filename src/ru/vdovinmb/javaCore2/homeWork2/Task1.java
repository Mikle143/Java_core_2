package ru.vdovinmb.javaCore2.homeWork2;

import java.util.Arrays;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Task1 {
    public static void main(String[] args) {
        String string = "abc Cpddd Dio OsfWw";
        System.out.println(delete(string));
    }

    static String delete(String string) {
        string = string.toUpperCase();
        StringBuilder newStringBuilder = new StringBuilder();
        newStringBuilder.append(string.charAt(0));
        int j = 1;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) != newStringBuilder.charAt(j - 1) && string.charAt(i) != ' ') {
                newStringBuilder.append(string.charAt(i));
                j++;
            }
        }
        String newString = newStringBuilder.toString();
        return newString;
    }
}
