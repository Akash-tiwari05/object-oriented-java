package string;

public class StringManipulation {

    public static void main(String[] args) {

        String birthDate = "11/12/2002";
        int index = birthDate.indexOf("2002");
        System.out.println("startingIndex = "+ index);
        System.out.println("Birth year = "+birthDate.substring(index));

        System.out.println("Birth Month = "+ birthDate.substring(3,5));

        String newDate = String.join("/", "25","11","1982");
        System.out.println("newDate = "+ newDate);

        newDate = newDate.replace('/','-');
        System.out.println(newDate);

        String multipleCharacter = "A man, a plan, a canal: Panama";
        multipleCharacter = multipleCharacter.replaceFirst("A","The");
        System.out.println(multipleCharacter);

        System.out.println(multipleCharacter.replaceAll("[^a-zA-z0-9]",""));

        System.out.println("ABC\n".repeat(3).indent(3));
        System.out.println("-".repeat(20));

    }
}
