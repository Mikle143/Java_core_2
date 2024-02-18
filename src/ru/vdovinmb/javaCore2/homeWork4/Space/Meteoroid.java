package ru.vdovinmb.javaCore2.homeWork4.Space;

public class Meteoroid extends CosmicBody implements Burn{
    public Meteoroid(double r, double p) {
        super(r, p);
    }

    @Override
    public void orbita() {
        System.out.println("Подобно планетам, их спутникам, астероидам и многим кометам, " +
                "метеорные тела движутся в пространстве вокруг Солнца по замкнутым эллиптическим орбитам.");
    }

    @Override
    public void description() {
        System.out.println("Метеоро́ид (метео́рное тело) — небесное тело, промежуточное по размеру между космической пылью и астероидом.");
    }

    @Override
    public void burning() {
        System.out.println("Метеороид влетел в атмосефру Земли, превратился в метеорит и сгорел");
    }

    @Override
    public String toString() {
        return "Meteoroid{" +
                "r=" + getR() +
                ", p=" + getP() +
                '}';
    }
}
