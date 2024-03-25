package ru.vdovinmb.javaCore2.homeWork9;

import java.util.Random;

class CrystalPlanet {
    private int redCrystals;
    private int whiteCrystals;

    public CrystalPlanet() {
        redCrystals = 0;
        whiteCrystals = 0;
    }

    public synchronized void collectCrystals() {
        Random random = new Random();
        int red = random.nextInt(0, 5); // Генерация от 0 до 5 красных кристаллов
        int white = 5 - red; // Оставшееся количество будет белыми кристаллами
        redCrystals += red;
        whiteCrystals += white;
        System.out.println("Собрано " + red + " красных кристаллов и " + white + " белых кристаллов.");
        notifyAll();
    }

    public synchronized int[] loadRocket() throws InterruptedException {
//        while (redCrystals < 1 && whiteCrystals < 1) {
//            wait(); // Ожидание, пока не вырастут красные или белые кристаллы
//        }
        int red = redCrystals;
        int white = whiteCrystals;
        redCrystals = 0;
        whiteCrystals = 0;
        return new int[]{red, white};
    }


}