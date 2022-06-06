package at.campus02.iwi.pr2;

import java.util.ArrayList;
import java.util.HashMap;

public class Island {

    public ArrayList<Facility>facilities = new ArrayList<>();
    public double facilityArea;

    public Island() {
        this.facilities = facilities;
        this.facilityArea = 0;
    }
    public void addFacility(Facility f){
        facilities.add(f);
        facilityArea += f.area;
    }
    public double findHighestProfit(){
        double highestP = 0;
        for(Facility f: facilities){
            double pr = f.calculateProfit();
        if(highestP > pr){
            highestP = pr;
        }

        }
        return highestP;
    }

    public HashMap<String, Integer>groupFacilities(){
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        int low = 0;
        int avarage = 0;
        int high = 0;


        for(Facility f: facilities){
            double profit = f.calculateProfit();
            if(profit < 1000){
                ++low;
            }
            else if( profit < 10000){
                ++avarage;
            }
            else{
                ++high;
            }
        }
        hs.put("Low", low);
        hs.put("Avarage", avarage);
        hs.put("High", high);
        return hs;

    }

    public ArrayList<Facility> risingWatterSimulation(double waterLevel){
        ArrayList<Facility> fs = new ArrayList<>();

        for(Facility f: facilities){
            if(f.heightAboveSeaLevel <= waterLevel){
                fs.add(f);
            }
        }
        return fs;
    }
}