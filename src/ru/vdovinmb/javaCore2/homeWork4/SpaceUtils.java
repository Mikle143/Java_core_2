package ru.vdovinmb.javaCore2.homeWork4;

import ru.vdovinmb.javaCore2.homeWork4.Space.CosmicBody;
import ru.vdovinmb.javaCore2.homeWork4.Space.Star;

public final class SpaceUtils {
    private SpaceUtils() {
    }
    public static double gravitation(CosmicBody cosmicBody1, CosmicBody cosmicBody2, double distance){
        return 6.67*Math.pow(10,-11)* cosmicBody1.m()* cosmicBody2.m()/(distance*distance);
    }
    public static boolean isStar(CosmicBody cosmicBody){
        return Star.class.isAssignableFrom(cosmicBody.getClass());
    }
}
