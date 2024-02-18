package ru.vdovinmb.javaCore2.homeWork4.Space;

public abstract class Star extends CosmicBody {
    private String color; //цвет звезды
    private String size;// размер звезды

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public Star(double r, double p, String color, String size) {
        super(r, p);
        this.color=color;
        this.size=size;
    }
}
