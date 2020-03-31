import attractions.*;
import behaviours.IReviewed;
import stalls.*;

import java.util.ArrayList;

public class ThemePark {
    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private CandyflossStall candyFlossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;


    public Themepark(String name){
        this.name = name;

        attractions = new ArrayList<Attraction>();
        attractions.add(dodgems);
        attractions.add(park);
        attractions.add(playground);
        attractions.add(rollerCoaster);

        stalls = new ArrayList<Stall>();
        stalls.add(candyFlossStall);
        stalls.add(iceCreamStall);
        stalls.add(tobaccoStall);

        reviewed = new ArrayList<IReviewed>();
    }
}
