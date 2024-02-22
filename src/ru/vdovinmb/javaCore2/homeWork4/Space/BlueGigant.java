package ru.vdovinmb.javaCore2.homeWork4.Space;

public class BlueGigant extends Star {

    public BlueGigant(double r, double p, String color, String size) {
        super(r, p, color, size);
    }

    @Override
    public void orbita() {
        System.out.println("Движется по орбите голубых гигантов");
    }

    @Override
    public void description() {
        System.out.println("Голубые сверхгиганты — это массивные звёзды, находящиеся в определённой фазе процесса «умирания». " +
                "В этой фазе интенсивность протекающих в ядре звезды термоядерных реакций снижается, что приводит к сжатию звезды. " +
                "В результате значительного уменьшения площади поверхности увеличивается плотность излучаемой энергии, а это, " +
                "в свою очередь, влечёт за собой нагрев поверхности. Такого рода сжатие массивной звёзды приводит к превращению красного " +
                "сверхгиганта в голубой. Возможен также обратный процесс — превращение голубого сверхгиганта в красный.");
    }

    @Override
    public String toString() {
        return "BlueGigant{" +
                "color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", r=" + getR() +
                ", p=" + getP() +
                '}';
    }
}
