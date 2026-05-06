package abstraction.annimal;


abstract class Mammal extends Animal{

    public Mammal(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed){
        System.out.println(getExplicitType()+" ");
        System.out.println(speed.equals("slow")?"walk":"runs");
    }

    public abstract void shedHair();
}

public abstract class Animal {

    protected String type;

    protected String size;

    protected int weight;

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String move);
    public abstract void makeNoise();

    public String getExplicitType(){
        return getClass().getSimpleName()+" ( "+type+" )";
    }
}
