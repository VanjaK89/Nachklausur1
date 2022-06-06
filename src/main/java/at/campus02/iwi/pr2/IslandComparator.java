package at.campus02.iwi.pr2;

import java.util.Comparator;

public class IslandComparator implements Comparator<Facility> {
    @Override
    public int compare(Facility o1, Facility o2) {
       if(o1.getHeightAboveSeaLevel() == o2.getHeightAboveSeaLevel()){
           return Double.compare(o1.getArea(), o2.getArea());
       }
        return Double.compare(o1.getHeightAboveSeaLevel(), o2.getHeightAboveSeaLevel());
    }
}