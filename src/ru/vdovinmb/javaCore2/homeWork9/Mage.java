package ru.vdovinmb.javaCore2.homeWork9;

class Mage implements Runnable {
    private final String type;
    private final CrystalPlanet planet;
    private int redCrystalsCollected;
    private int whiteCrystalsCollected;

    public Mage(String type, CrystalPlanet planet) {
        this.type = type;
        this.planet = planet;
        whiteCrystalsCollected = 0;
        redCrystalsCollected = 0;
    }

    public boolean isCompetitionOver() {
        return redCrystalsCollected >= 20 && whiteCrystalsCollected >= 20;
    }

    @Override
    public void run() {
        while (!isCompetitionOver()) {
            try {
                int[] crystals = planet.loadRocket();
                redCrystalsCollected += crystals[0];
                whiteCrystalsCollected += crystals[1];
                System.out.println(type + " получил " + crystals[0] + " красных кристаллов и " + crystals[1] + " белых кристаллов.");
                Thread.sleep(100); // Задержка для имитации времени полёта ракеты
                planet.collectCrystals();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(type + " завершил соревнование с " + redCrystalsCollected + " красными кристаллами и " + whiteCrystalsCollected + " белыми кристаллами.");


    }
}
