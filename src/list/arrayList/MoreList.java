package list.arrayList;

import java.util.*;

public class MoreList {

    public static void main(String[] args) {

        String[] items = {"Oranges","Apples","Banana","Milk","Butter"};

        //here array list is immutable because of Its use ImmutableClass
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());

        //here use for mutable
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList<String> nextItems = new ArrayList<>(
                List.of("Pickles","Mustard","Cheese")
        );

        System.out.println(nextItems);
        groceries.addAll(nextItems);
        System.out.println(groceries);


        if(groceries.contains("Mustard")){
            System.out.println("List Contains Mustard");
        }

        System.out.println(groceries.indexOf("Yogurt"));
        System.out.println(groceries.lastIndexOf("Yogurt"));

        Collections.sort(groceries);
        System.out.println("Groceries is sorting order = "+groceries);

        groceries.removeAll(List.of("Apples","Milk"));
        System.out.println(groceries);

        groceries.retainAll(List.of("Banana","Mustard","Cheese"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        //it takes array as an argument
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
