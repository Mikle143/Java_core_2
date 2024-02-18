package ru.vdovinmb.javaCore2.homeWork4.Space;

public class Planet extends CosmicBody {
    private int n;// какая по счету от Солнца
    private String name;//название планеты

    public int getN() {
        return n;
    }
    public String getName() {
        return name;
    }
    public Planet(double r, double p, int n, PlanetsName name) {
        super(r, p);
        this.n = n;
        this.name = name.toString();
    }
    @Override
    public void orbita() {
        System.out.println("Движется по орбите вокруг Солнца");
    }
    @Override
    public void description() {
        switch (name) {
            case " MERCURY" -> System.out.println("Информация про Меркурий");
            case "VENUS" -> System.out.println("Информация про Венеру");
            case "EARTH" -> System.out.println("Информация про Землю");
            case "MARS" -> System.out.println("Информация про Марс");
            case "JUPITER" -> System.out.println("Информация про Юпитер");
            case "SATURN" -> System.out.println("Информация про Сатурн");
            case "URANUS" -> System.out.println("Информация про Уран");
            case "NEPTUNE" -> System.out.println("Информация про Нептун");
        }

    }

    @Override
    public String toString() {
        return "Planet{" +
                "n=" + n +
                ", name='" + name + '\'' +
                ", r=" + getR() +
                ", p=" + getP() +
                '}';
    }
}
