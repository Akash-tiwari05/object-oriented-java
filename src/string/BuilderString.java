package string;

public class BuilderString {

    public static void main(String[] args) {
        String helloWorld = "Hello"+ " World";
        StringBuilder sb = new StringBuilder("Hello"+" World");


        printInformation(helloWorld);
        printInformation(sb);

        helloWorld.concat(" and Goodbye");
        sb.append(" and Goodbye");
        printInformation(helloWorld);
        printInformation(sb);

        /// initial capacity is 16
        StringBuilder emptyStart = new StringBuilder();
        printInformation(emptyStart);
        /// now capacity is 32
        StringBuilder emptyStart32 = new StringBuilder(32);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello"+" World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16,'g');
        printInformation(builderPlus);

        builderPlus.replace(16,17,"G");
        printInformation(builderPlus);

        builderPlus.reverse().setLength(7);
        printInformation(builderPlus);
    }

    public static void printInformation(String string){
        System.out.println("String = "+string);
        System.out.println("Length = "+string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = "+builder);
        System.out.println("Length = "+builder.length());
        System.out.println("capacity = "+builder.capacity());
    }
}
