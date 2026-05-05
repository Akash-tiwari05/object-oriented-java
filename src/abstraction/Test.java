package abstraction;

abstract class Parent {

    Parent() {
        System.out.println("Parent Constructor");
    }


    /**
     * abstract method does not have any data members
     */
    abstract void show();

    void display() {
        System.out.println("Parent Display");
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Child Constructor");
    }

    void show() {
        System.out.println("Child Show");
    }
}

public class Test {
    public static void main(String[] args) {

        Parent p = new Child();
        p.display();
        p.show();
    }
}
