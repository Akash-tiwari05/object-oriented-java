package abstraction.interfaceClass;

public class Test {

    public static void main(String[] args) {

        inFlight(new Jets());

        //OrbitEarth.log("Testing"+ new Satellite());
    }


    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable trackable){
            trackable.track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth flier){
        flier.takeOff();
        flier.fly();

        flier.land();
    }
}
