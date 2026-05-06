package abstraction.interfaceClass;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        //Trackable trackable = bird;

        animal.move();
/*        flier.fly();
        flier.land();
        flier.takeOff();
        trackable.track();*/

        inFlight(flier);
        System.out.println("_".repeat(40));
        inFlight(new Jets());

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled*FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n",
                kmsTraveled,milesTraveled);

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);
    }

    public static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable trackable){
            trackable.track();
        }
        flier.land();
    }
}
