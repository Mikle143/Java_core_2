package ru.vdovinmb.javaCore2.homeWork4;

import ru.vdovinmb.javaCore2.homeWork4.Space.Meteoroid;
import ru.vdovinmb.javaCore2.homeWork4.Space.Planet;
import ru.vdovinmb.javaCore2.homeWork4.Space.PlanetsName;
import ru.vdovinmb.javaCore2.homeWork4.Space.YellowDwarf;

public class SpaceRunner {
    public static void main(String[] args) {
        YellowDwarf sun = new YellowDwarf(695000000, 1400, "yellow", "dwarf");
        Planet Mars = new Planet(3350000, 3900, 4, PlanetsName.MARS);
        Planet Earth = new Planet(6371000, 5500, 3, PlanetsName.EARTH);
        Meteoroid meteoroid = new Meteoroid(15, 4000);
        System.out.println("Марс весит " + Mars.m());
        System.out.println("Земля весит " + Earth.m());
        System.out.println("Метеороид весит " + meteoroid.m());
        Mars.compare(Earth);
        meteoroid.compare(Mars);
        Earth.compare(Earth);
        System.out.println(Earth.d());
        System.out.println(SpaceUtils.gravitation(Earth, Mars, 55000000));
        System.out.println(SpaceUtils.isStar(Mars));
        System.out.println(SpaceUtils.isStar(sun));
        sun.description();
        Mars.description();
        System.out.println(Mars.getN());
    }
}
