package abstraction.annimal;

public class Fish extends Animal {


    public Fish(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")){
            System.out.println(getExplicitType()+" lazily swimming");
            System.out.println("____________");
        }else{
            System.out.println(getExplicitType() +" darting frantically");
            System.out.println("____________");
        }

    }

    @Override
    public void makeNoise() {

        if(type == "GoldFish"){
            System.out.println("Swoosh");

        }else{
            System.out.println("Splash..");
        }
    }
}
