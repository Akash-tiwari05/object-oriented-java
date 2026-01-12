package OOPs.instance;


public class CarObject {
    private final Car car;

    public CarObject(Car car){
        this.car = car;
    }


    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Model -X");
        car.setColor("Grey");
        car.setDoors(2);
        car.setConvertible(true);
        car.describeCars();
    }
}
