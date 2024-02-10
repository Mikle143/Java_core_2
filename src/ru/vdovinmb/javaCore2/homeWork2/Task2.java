package ru.vdovinmb.javaCore2.homeWork2;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2 {
    public static void main(String[] args) {
        String string = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] ints = ints(string);
        System.out.println(sum(ints));
        for (int a : ints) {
            System.out.print(a + " ");
        }
    }

    private static int count(String string) {  //Определяем количество чисел
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> count++;
                default -> count = count;
            }
        }
        return count;
    }

    private static int[] ints(String string) {  //Возвращает массив цифр из переданной строки
        int a = 0;
        int j = 0;
        int lenght = count(string);
        int[] ints = new int[lenght];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '0') {
                a = 0;
            } else if (string.charAt(i) == '1') {
                a = 1;
            } else if (string.charAt(i) == '2') {
                a = 2;
            } else if (string.charAt(i) == '3') {
                a = 3;
            } else if (string.charAt(i) == '4') {
                a = 4;
            } else if (string.charAt(i) == '5') {
                a = 5;
            } else if (string.charAt(i) == '6') {
                a = 6;
            } else if (string.charAt(i) == '7') {
                a = 7;
            } else if (string.charAt(i) == '8') {
                a = 8;
            } else if (string.charAt(i) == '9') {
                a = 9;
            } else continue;
            ints[j] = a;
            j++;
        }
        return ints;
    }

    static int sum(int[] ints) {
        int sum = 0;
        for (int a : ints) {
            sum += a;
        }
        return sum;
    }

}
