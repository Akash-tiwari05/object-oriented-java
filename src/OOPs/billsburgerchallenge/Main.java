package OOPs.billsburgerchallenge;

public class Main {

    public static void main(String[] args) {

        /*Item item = new Item("coke","Drink",1.5);
        item.printItem();
        item.setSize("LARGE");
        item.printItem();*/

        /*Burger burger = new Burger("regular",2.0);
        burger.addTopping("BACON","CHEESE","MAYO");
        burger.printItem();*/

        MealOrder secondMeal = new MealOrder("deluxe","7-up",
                "chilli");
        secondMeal.addToppings("LETTUCE","CHEESE","MAYO","AVOCADO","BACON");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

    }
}
