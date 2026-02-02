package OOPs.polymorphism.car;

public class Car {

    private String description;

    public void startEngine(){
        System.out.println("Car -> startEngine");
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }
    public void drive(){
        System.out.println("Car -> driving, type is "+getClass().getSimpleName());
        runEngine();
    }

    public Car(String description) {
        this.description = description;
    }

}

class GasPoweredCar extends Car{

    private double avgKmPerLiter;

    private int cylinders;

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n",
                cylinders);
    }

    @Override
    public void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n",
                avgKmPerLiter);
    }

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter,
                         int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

}

class ElectricCar extends Car{

    private double avgKmPerLiter;

    private int batterySize;

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kwh battery on, Ready!%n",
                batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n",
                avgKmPerLiter);
    }

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerLiter,
                       int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
    }
}

class HybridCar extends Car{

    private double avgKmPerLiter;

    private int batterySize;

    private int cylinders;

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders on, Ready!%n",
                cylinders);
        System.out.printf("Hybrid -> switch %d kwh battery on, Ready!%n",
                batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("Hybrid -> usage under the average: %.2f %n",
                avgKmPerLiter);
    }

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter,
                     int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}
