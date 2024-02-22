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
public class ATM {
    private int count_10 = 0; //количество купюр по 10 в банкомате
    private int count_20 = 0; //количество купюр по 20 в банкомате
    private int count_50 = 0; //количество купюр по 50 в банкомате

    public ATM(int count_10, int count_20, int count_50) {
        this.count_10 = count_10;
        this.count_20 = count_20;
        this.count_50 = count_50;
        System.out.println("В банкомате: " + (this.count_10 * 10 + this.count_20 * 20 + this.count_50 * 50));
    }

    public void add(int count_10toAdd, int count_20toAdd, int count_50toAdd) {
        count_10 += count_10toAdd;
        count_20 += count_20toAdd;
        count_50 += count_50toAdd;
        System.out.println("В банкомат внесено: " + (count_10toAdd * 10 + count_20toAdd * 20 + count_50toAdd * 50));
        System.out.println("В банкомате стало: " + (count_10 * 10 + count_20 * 20 + count_50 * 50));
    }
    private int currentSum(){
        return count_10 * 10 + count_20 * 20 + count_50 * 50;
    }
    public boolean withdraw(int moneyToWithdraw) {
        int sum = count_10 * 10 + count_20 * 20 + count_50 * 50;//сколько всего денег в банкомате
        int count_50toWithdrow = 0;//количество купеюр по 50, необходимых к выдаче
        int count_20toWithdrow = 0;//количество купеюр по 20, необходимых к выдаче
        int count_10toWithdrow = 0;//количество купеюр по 10, необходимых к выдаче
        if (moneyToWithdraw > sum) {//если сумма для выдачи > суммы денег в банкомате
            System.out.println("В банкомате недостаточно денег");
            return false;
        } else {
            count_50toWithdrow = moneyToWithdraw / 50; // количество купюр по 50, необходимых к выдаче
            if (count_50toWithdrow <= count_50 && count_50toWithdrow >= 1) {// если количество купюр, необходимых к выдаче, меньше
                //количества купюр в банкомате и >=1, то выдаем
                count_50 = count_50 - count_50toWithdrow;// остаток купюр по 50 в банкомате
                moneyToWithdraw -= count_50toWithdrow * 50;//остаток суммы к выдаче
                sum = currentSum();//остаток денег в банкомате
            } else if (count_50toWithdrow > count_50) {//если количество купюр, необходимых к выдаче, больше
                //количества купюр в банкомате, то
                count_50toWithdrow = count_50;//выдаем все купюры по 50, которые есть в банкомате
                count_50 = 0;// остаток купюр по 50 в банкомате
                moneyToWithdraw -= count_50toWithdrow * 50;//остаток суммы к выдаче
                sum = currentSum();//остаток денег в банкомате
            }
            count_20toWithdrow = moneyToWithdraw / 20;// количество купюр по 20, необходимых к выдаче
            if (count_20toWithdrow <= count_20 && count_20toWithdrow >= 1) {
                count_20 = count_20 - count_20toWithdrow;
                moneyToWithdraw -= count_20toWithdrow * 20;
                sum = count_10 * 10 + count_20 * 20 + count_50 * 50;//остаток денег в банкомате
            } else if (count_20toWithdrow > count_20) {
                count_20toWithdrow = count_20;
                count_20 = 0;
                moneyToWithdraw -= count_20toWithdrow * 20;
                sum = currentSum();//остаток денег в банкомате
            }
            count_10toWithdrow = moneyToWithdraw / 10;
            if (count_10toWithdrow <= count_10 && count_10toWithdrow >= 1) {
                count_10 -= count_10toWithdrow;
                moneyToWithdraw -= count_10toWithdrow * 10;
                sum = currentSum();//остаток денег в банкомате
            } else if (count_10toWithdrow > count_10) {
                count_10toWithdrow = count_10;
                count_10 = 0;
                moneyToWithdraw -= count_10toWithdrow * 10;
                sum = currentSum();//остаток денег в банкомате
            }
            System.out.println("Выдано купюрами по 50: " + count_50toWithdrow + " по 20: " + count_20toWithdrow + " по 10: " + count_10toWithdrow);
            System.out.println("Осталось денег в банкомате: " + sum);
            return true;
        }
    }
}
