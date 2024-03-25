package ru.vdovinmb.javaCore2.homeWork9;

public class Running {
    public static void main(String[] args) {
        CrystalPlanet planet = new CrystalPlanet();
        Mage fireMage = new Mage("Маг огня", planet);
        Mage airMage = new Mage("Маг воздуха", planet);

        Thread fireMageThread = new Thread(fireMage);
        Thread airMageThread = new Thread(airMage);

        fireMageThread.start();
        airMageThread.start();
    }
}