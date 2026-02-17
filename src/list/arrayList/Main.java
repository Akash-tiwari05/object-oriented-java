package list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }
}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem("Milk");
        groceryItems[1] = new GroceryItem("Apple","PRODUCE",6);
        groceryItems[2] = new GroceryItem("Orange","PRODUCE",5);

        System.out.println(Arrays.toString(groceryItems));

        //default it take object as input
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
        System.out.println(objectList);


        ArrayList<GroceryItem> groceryList = new ArrayList<>();

        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("orange","PRODUCES",5));
        groceryList.add(new GroceryItem("Banana","PRODUCES",5));
        groceryList.add(0,new GroceryItem("Apples","PRODUCES",5));
        System.out.println(groceryList);
        
    }
}
