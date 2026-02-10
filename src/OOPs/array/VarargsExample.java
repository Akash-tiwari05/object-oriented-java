package OOPs.array;

public class VarargsExample {

    //varargs
    public static void main(String... args) {

        System.out.println("Hello World Again");
        String[] splitSpring = "Hello World Again".split(" ");
        printText(splitSpring);
        System.out.println("-".repeat(20));
        printText("Hello");
    }

    private static void printText(String... t){

        for(String s: t){
            System.out.println(s);
        }
    }

}
