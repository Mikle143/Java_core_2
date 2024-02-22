package ru.vdovinmb.javaCore2.homeWork4.Space;

public class RedDwarf extends Star {

    public RedDwarf(double r, double p, String color, String size) {
        super(r, p, color, size);
    }

    @Override
    public void orbita() {
        System.out.println("Движется по орбите красных карликов");
    }

    @Override
    public void description() {
        System.out.println("Красные карлики довольно сильно отличаются от других звёзд. Масса красных карликов " +
                "не превышает трети солнечной массы. Температура фотосферы красного карлика может достигать 3500 К, " +
                "что превышает температуру спирали лампы накаливания, поэтому, вопреки своему названию, красные карлики, " +
                "аналогично лампам, испускают свет не красного, а скорее охристо-желтоватого оттенка. " +
                "Звезды этого типа испускают очень мало света, иногда в 10 000 раз меньше чем Солнце. ");

    }

    @Override
    public String toString() {
        return "RedDwarf{" +
                "color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", r=" + getR() +
                ", p=" + getP() +
                '}';
    }
}
