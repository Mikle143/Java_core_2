package ru.vdovinmb.javaCore2.homeWork3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите количество купюр по 10, 20 и 50, которые первоначально находятся в банкомате");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        ATM atm = new ATM(a, b, c);
        System.out.println("Введите количество купюр по 10, 20 и 50, которые вы хотите положить в банкомат");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        atm.add(a, b, c);
        System.out.println("Введите сумму, которую вы собираетесь снять");
        a = scanner.nextInt();
        System.out.println(atm.withdraw(a));
    }
}
