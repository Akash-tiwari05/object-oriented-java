package string;

public class ComparisonMethod {

    public static void main(String[] args) {
        String helloWorld = "Hello World";
        String helloWorldLower  = helloWorld.toLowerCase();

        if(helloWorldLower.equals(helloWorld)){
            System.out.println("Values match exactly");
        }
        if(helloWorldLower.equalsIgnoreCase(helloWorld)){
            System.out.println("Values match ignoring case");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String start with Hello");
        }
        if(helloWorld.endsWith("World")){
            System.out.println("String end with World");
        }

        if(helloWorld.contains("World")){
            System.out.println("String contains World");
        }
    }
}
