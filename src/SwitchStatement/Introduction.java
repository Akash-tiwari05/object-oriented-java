package SwitchStatement;

import java.sql.SQLOutput;

public class Introduction {
    public static void main(String[] args) {
        int switchValue = 4;

        //tradition switch cases
        switch (switchValue){
            case 1 :
                System.out.println("Switch value = 1");
                break;
            case 2 :
                System.out.println("Switch value = 2");
                break;
                //grouping a switch case in the below
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4 or a 5");
                System.out.println("Switch value = "+ switchValue);
                break;
            default :
                System.out.println("No Value found");
        }

        //enhanced switch cases
        switchValue = 5;
        switch (switchValue){
            case 1 -> System.out.println("Switch value = 1");
            case 2 -> System.out.println("Switch value = 2");
            //grouping a switch case in the below
            case 3, 4, 5 ->{
                System.out.println("Was a 3, a 4 or a 5");
                System.out.println("Switch value = "+ switchValue);
            }
            default -> System.out.println("No Value found");
        }
    }
}
