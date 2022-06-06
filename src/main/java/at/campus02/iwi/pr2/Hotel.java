package at.campus02.iwi.pr2;

public class Hotel extends Facility{

    protected int stars;
    protected int maxNrGuests;
    protected int nrGuests;

    public Hotel(double area, double highAboveTheSeaLevel, int stars, int maxNrGuests, int nrGuests) {
        super(area, highAboveTheSeaLevel);
        if(stars < 1 || stars > 3){
            this.stars = 1;
        }
        else {
            this.stars = stars;
        }
        this.maxNrGuests = maxNrGuests;
        this.nrGuests = nrGuests;
    }

    public int getStars() {
        return stars;
    }

    public int getMaxNrGuests() {
        return maxNrGuests;
    }

    public int getNrGuests() {
        return nrGuests;
    }

    @Override
    public double calculateProfit() {
        double ausgaben = 0;
        ausgaben = (stars * 0.1 + 0.1) * 30 * maxNrGuests;
        double erg = 0;
        if(stars == 1){   //erlöse
            erg = 60 * nrGuests;
        }
        else if(stars == 2){
            erg = 75 * nrGuests;
        }
        else if ( stars == 3) {
            erg = 120 * nrGuests;
        }
        return erg - ausgaben ;

    }

    @Override
    public int getNrPalms() {
         double erg = (double) nrGuests / maxNrGuests;
        if(erg > 0.85)
        {
            return 3;
        }
        else if( erg > 0.5)
        {
            return 2;
        }
      return 1;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nrGuests=" + nrGuests +
                '}';
    }
}