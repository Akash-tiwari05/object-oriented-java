package OOPs.instance;

public class Car {

    private String make;

    private String color;

    private String model;

    private int doors;

    private boolean isConvertible;

    public void describeCars(){
        System.out.println(doors + " Doors " + make+" "+
                color +" " +model + " "+
                (isConvertible?"Convertible":""));
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public Car(){

    }

    /*public Car(String make, String color, String model, int doors, boolean isConvertible) {
        this.make = make;
        this.color = color;
        this.model = model;
        this.doors = doors;
        this.isConvertible = isConvertible;
    }*/
}
