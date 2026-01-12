package OOPs.inheritence;

public class Animal {

    private String type;
    private String size;
    private int weight;

    public Animal(){
        //no args constructor
    }

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void moves(String speed){
        System.out.println(type +" moves "+ speed);
    }

    public void makeNoice(){
        System.out.println(type +" make some kind of noice...");
    }
}
