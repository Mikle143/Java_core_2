package ru.vdovinmb.javaCore2.homeWork4.Space;

public abstract class CosmicBody implements Comparable<CosmicBody> {

    public CosmicBody(double r, double p) {
        this.r = r;
        this.p = p;
    }

    private double r;//радиус (м)
    private double p;//плотность (кг/м3)

    public double getR() {
        return r;
    }

    public double getP() {
        return p;
    }

    public double m() {
        return 4 * Math.PI * p * Math.pow(r, 3) / 3;
    }//рассчитывает массу исходя из плотности и радиуса

    public double d() {
        return r * 2;
    } // расчитывает диаметр

    public abstract void orbita();//форма орбиты

    public abstract void description();//описание космического тела

    @Override
    public int compareTo(CosmicBody cosmicBody) { //переопределенный compareTo
        if (m() > cosmicBody.m()) {
            return 1;
        } else if (m() < cosmicBody.m()) {
            return -1;
        } else return 0;
    }

    public void compare(CosmicBody cosmicBody2) { //метод сравнения масс двух тел на основе compareTo
        switch (compareTo(cosmicBody2)) {
            case 1 -> System.out.println(this + " > " + cosmicBody2);
            case -1 -> System.out.println(this + " < " + cosmicBody2);
            case 0 -> System.out.println(this + " = " + cosmicBody2);
            default -> System.out.println("Invalid objects to compare");
        }
    }
}
