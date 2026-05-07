package abstraction.interfaceClass;


enum FlightStages implements Trackable{
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTIONS;

    @Override
    public void track() {

        if(this != GROUNDED){
            System.out.println("Monitoring "+this);
        }
    }

    public FlightStages getNextStages(){

        FlightStages[] allStages = values();
        return allStages[ordinal()+1 % allStages.length];

    }
}

record DragonFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+ " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+ " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+ " is flying");
    }
}

class Satellite implements OrbitEarth{

    @Override
    public void achieveOrbit() {
        System.out.println("Orbit was achieve.");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+ " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+ " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+ " is flying");
    }
}

interface OrbitEarth extends FlightEnabled{

    void achieveOrbit();

    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today+ ": "+ description);
    }
}

interface FlightEnabled {

    //there are treat as constant
    //in internal int treats as a
    //public static final double
    double MILES_TO_KM = 1.60934;

    double KM_TO_MILES = 0.621371;

    void takeOff();

    void land();

    void fly();

    default FlightStages transition(FlightStages stage){
        FlightStages nextStage = stage.getNextStages();
        System.out.println("Transitions from "+stage+ " to "+nextStage);
        return FlightStages.CRUISE;
    }
}

interface Trackable{

    void track();
}

public abstract class Animal{

    public abstract void move();
}
