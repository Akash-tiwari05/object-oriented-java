package OOPs.inheritence;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat","small",35);
        //System.out.println(animal);
        doAnimalStuff(animal, "slow");

        /// here dog inherit from Animal class which runs fine
        Dog dog = new Dog();
        doAnimalStuff(dog,"fast" );
    }


    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoice();;
        animal.moves(speed);
        System.out.println(animal);
        System.out.println("___________");
    }

}
