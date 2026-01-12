package OOPs.inheritence.animal;

///  dog inherit property of Animal class including behaviour as well as
public class Dog extends Animal {

    private String earShape;

    private String tailShape;

    /*
    here dog constructor call the Super class(such as Animal here) using super
    keyword
     */
    public Dog() {
        super("Fluffy","Medium",50.00);
    }

    public Dog(String type, double weight){
        /// this is constructor chaining for the all args constructor
        this(type,weight,"Perky","Curled");

    }


    /**
     *below down all args constructor for dog class using super keyword to override
     * Animal constructor
     * @param type is the dog type require string as input
     * @param weight is the weight of the dog that require double as input
     * @param tailShape is the shape of tail of dogs that require string value as input
     * @param earShape is the shape of ear of dog that require string as input
     */

    public Dog(String type, double weight, String tailShape, String earShape) {
        super(type, weight < 15?"small":(weight <35 ? "medium":"large"), weight);
        this.tailShape = tailShape;
        this.earShape = earShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoice() {

        if(type.equals("Wolf")){
            System.out.println("Oh ooooo....");
        }
        bark();
        System.out.println();
    }

    @Override
    public void moves(String speed) {
        super.moves(speed);
        if(speed.equals("slow")){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }



    private void bark(){
        System.out.println("Woof! Woof!");
    }

    private void walk(){
        System.out.println("Dog Walking ");
    }

    private void run(){
        System.out.println("Dog Running ");
    }

    private void wagTail(){
        System.out.println("Dog wag tail ");
    }

}
