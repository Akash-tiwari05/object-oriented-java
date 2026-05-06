package abstraction.annimal;

public class Dog extends Animal {


    public Dog(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed.equals("slow")){
            System.out.println(getExplicitType()+" walking");
            System.out.println("____________");
        }else{
            System.out.println(getExplicitType() +" running");
            System.out.println("______________");
        }

    }

    @Override
    public void makeNoise() {

        if(type == "Wolf"){
            System.out.println("Howling!..");
        }else{
            System.out.println("Woof!..");
        }
    }
}
