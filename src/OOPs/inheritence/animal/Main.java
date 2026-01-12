package OOPs.inheritence.animal;

public class Main {
    public static void main(String[] args) {
       Animal animal = new Animal("Cat","small",35.00);
        //System.out.println(animal);
        doAnimalStuff(animal, "slow");

        /// here dog inherit from Animal class which runs fine
        Dog dog = new Dog();
        doAnimalStuff(dog,"fast" );

        Dog akashDog = new Dog("Yorkie",15);
        doAnimalStuff(akashDog,"fast");
        Dog newDog = new Dog("Labrador Retriever", 65,
                "Floppy","Swimmer");
        doAnimalStuff(newDog, "slow");

        Dog wolf = new Dog("Wolf",70);
        doAnimalStuff(wolf,"fast");

        Fish goldie = new Fish("Gold Fish", 0.2,
                2,3);
        doAnimalStuff(goldie,"fast");
    }


    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoice();;
        animal.moves(speed);
        System.out.println(animal);
        System.out.println("___________");
    }

}
