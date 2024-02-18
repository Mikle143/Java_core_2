package ru.vdovinmb.javaCore2.homeWork4.Space;

public class YellowDwarf extends Star {
    public YellowDwarf(double r, double p, String color, String size) {
        super(r, p, color, size);
    }
    @Override
    public void orbita() {
        System.out.println("Движется по орбите желтых карликов");
    }
    @Override
    public void description() {
        System.out.println("Жёлтый карлик — класс небольших звёзд главной последовательности, " +
                "имеющих массу от 0,84 до 1,15 массы Солнца и температуру поверхности 5000—6000 K[1] " +
                "(более горячие звёзды человеком визуально будут восприниматься как голубоватые или голубые). " +
                "Самым известным и наиболее изученным жёлтым карликом естественно является Солнце.");
    }
    @Override
    public String toString() {
        return "YellowDwarf{" +
                "color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", r=" + getR() +
                ", p=" + getP() +
                '}';
    }
}
