package ru.vdovinmb.javaCore2.homeWork3;
/**
 * Задание 1
 * <p>
 * Создать класс, описывающий банкомат.
 * <p>
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма. Сначала банкомат будет
 * пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10 (не нужно рассматривать более сложные варианты
 * выдачи наличных, чтобы не усложнять алгоритм).
 */
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите количество купюр по 10, 20 и 50, которые первоначально находятся в банкомате");
        Scanner scanner = new Scanner(System.in);
        int input10 = scanner.nextInt();
        int input20 = scanner.nextInt();
        int input50 = scanner.nextInt();
        ATM atm = new ATM(input10, input20, input50);
        System.out.println("Введите количество купюр по 10, 20 и 50, которые вы хотите положить в банкомат");
        input10 = scanner.nextInt();
        input20 = scanner.nextInt();
        input50 = scanner.nextInt();
        atm.add(input10, input20, input50);
        System.out.println("Введите сумму, которую вы собираетесь снять");
        int inputSum = scanner.nextInt();
        System.out.println(atm.withdraw(inputSum));
    }
}
