package string;

public class InspectionMethod {
    public static void main(String[] args) {
        printInformation("Hello world!");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello world";
        System.out.printf("Index 0f 'r'  = %d %n",helloWorld.indexOf('r'));
        System.out.printf("Index 0f 'world'  = %d %n",helloWorld.indexOf("world"));
        System.out.printf("Last Index 0f 'l'  = %d %n",helloWorld.lastIndexOf('l'));

        System.out.printf("Index 0f 'l'  = %d %n",helloWorld.indexOf('l'));

        System.out.printf("Last Index 0f 'l'  = %d %n",helloWorld.lastIndexOf('l',8));

    }

    public static void printInformation(String string){

        int length = string.length();
        System.out.printf("Length  = %d %n",length);

        /// is empty return boolean value
        if(string.isEmpty()){
            System.out.println("String is empty..");
            return;
        }

        if (string.isBlank()){
            System.out.println("String is blank..");
        }

        System.out.printf("First char  = %c %n", string.charAt(0));

        System.out.printf("Last char  = %c %n", string.charAt(length -1));

    }
}
