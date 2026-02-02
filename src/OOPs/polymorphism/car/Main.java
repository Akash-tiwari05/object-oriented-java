package OOPs.polymorphism.car;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 gt");
        runCar(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 gt",
                15.4,6);
        runCar(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",
                568,75);
        runCar(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 gts",
                16,8,6);
        runCar(ferrariHybrid);
    }

    public static void runCar(Car car){
        car.startEngine();
        car.drive();

    }
}
