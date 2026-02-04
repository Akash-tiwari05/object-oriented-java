package OOPs.billsburgerchallenge;

public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;


    public MealOrder() {
        this("regular","coke","fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType){

        if(burgerType.equalsIgnoreCase("DELUXE")){
            this.burger = new DeluxeBurger(burgerType,8.5);
        }
        else{
            this.burger = new Burger(burgerType,4.00);
        }
        this.drink = new Item(drinkType, "DRINK", 1.00);
        this.side  = new Item(sideType,  "SIDE",  1.50);

    }

    public double getTotalPrice(){

        if(burger instanceof DeluxeBurger){
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice()+drink.getAdjustedPrice()+
                burger.getAdjustedPrice();
    }

    /*public void addToppings(String extra1,String extra2, String extra3){
        burger.addTopping(extra1,extra2,extra3);
    }*/

    public void addToppings(String extra1,String extra2, String extra3,
                            String extra4, String extra5){
        if(burger instanceof DeluxeBurger db){
            db.addTopping(extra1,extra2,extra3,extra4,extra5);
        }else {
            burger.addTopping(extra1,extra2,extra3);
        }
    }

    public void setDrinkSize(String drinkSize){
        drink.setSize(drinkSize);
    }

    public void printItemizedList(){
        burger.printItem();

        if( burger instanceof DeluxeBurger){
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        }else{
            drink.printItem();
            side.printItem();
        }

        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE: ",getTotalPrice());
    }
}



