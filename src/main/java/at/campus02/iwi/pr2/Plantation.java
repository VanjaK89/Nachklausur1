package at.campus02.iwi.pr2;
public class Plantation extends Facility{

    protected Fruit fruit;

    public Plantation(double area, double highAboveTheSeaLevel, Fruit fruit) {
        super(area, highAboveTheSeaLevel);
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }

    @Override
    public double calculateProfit() {
        double erg = 0;
        if (fruit == Fruit.BANANA) {
            erg = area * 30;
        } else if (fruit == Fruit.COCONUT) {
            erg = (area * 15) * 2.5;
        } else if (fruit == Fruit.MANGO) {
            if (heightAboveSeaLevel <= 150) {
                erg = (area * 15) * 3;
            } else {
                erg = (area * 10) * 3;
            }

        }
        return erg;
    }


    @Override
    public int getNrPalms() {
        return 0;
    }

    @Override
    public String toString() {
        return "Plantation{" +
                "fruit=" + fruit +
                '}';
    }
}