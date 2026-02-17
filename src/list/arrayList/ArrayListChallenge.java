package list.arrayList;

import java.util.*;

public class ArrayListChallenge {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        boolean flag = true;

        ArrayList<String> groceries = new ArrayList<>();
        while (flag){
            printActions();
            switch (Integer.parseInt(sc.nextLine())){

                case 0 -> flag = false;
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }


    private static void addItems(ArrayList<String> groceries){

        System.out.println("add item(s) to list(comma delimited list)");
        String[] items = sc.nextLine().split(",");

        for(String item : items){
            String trimmedItem = item.trim().toLowerCase();

            if(!groceries.contains(trimmedItem) && !trimmedItem.isEmpty()){
                groceries.add(trimmedItem);
            }
        }

    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("remove any items (comma delimited list)");
        String[] removeItems = sc.nextLine().split(",");

        for(String item : removeItems){
            String trimmedItem = item.trim().toLowerCase();

            if(groceries.contains(trimmedItem)){
                groceries.remove(trimmedItem);
            }
        }
    }

    private static void printActions(){

        String textBlocks= """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list(comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:""";
        System.out.println(textBlocks+" ");

    }
}
