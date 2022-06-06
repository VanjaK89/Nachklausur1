package at.campus02.iwi.pr2;

public class Mine extends Facility{

    protected double miningDepth;
    protected RawMaterial rawMaterial;

    public Mine(double area, double heightAboveSeaLevel, double miningDepth,RawMaterial rawMaterial ) {
        super(area, heightAboveSeaLevel);
        this.miningDepth = miningDepth;
        this.rawMaterial = rawMaterial;
    }

    public double getMiningDepth() {
        return miningDepth;
    }

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    @Override
    public double calculateProfit() {
        double erg;
        if (rawMaterial == RawMaterial.LITHIUM || rawMaterial == RawMaterial.NEODYMIUM) {
            erg = area * 200;
        } else {
            erg = area * 300;
        }
        return erg;
    }

    @Override
    public int getNrPalms() {
        int erg;
        if (miningDepth > 100) {
            erg = 3;
        } else if (rawMaterial == RawMaterial.TERBIUM) {
            erg = 2;
        }
        else {
            erg = 1;
        }

        return erg;
    }

    @Override
    public String toString() {
        return "Mine{" +
                "miningDepth=" + miningDepth + " height above the sea level " + heightAboveSeaLevel +
                '}';
    }


}