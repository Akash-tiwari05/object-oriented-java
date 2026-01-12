package OOPs.inheritence.animal;

public class Fish extends Animal{

    private int gills;
    private int fins;


    public Fish(String type, double weight, int gills, int fins) {

        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    public void moveMuscles(){
        System.out.print("muscle moving ");
    }

    public void moveBackFins(){
        System.out.print("backfins moving ");
    }

    @Override
    public void moves(String speed) {
        super.moves(speed);
        moveMuscles();
        if(speed.equals("fast")){
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
