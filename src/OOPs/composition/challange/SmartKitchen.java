package OOPs.composition.challange;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;


    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public SmartKitchen(CoffeeMaker brewMaster,
                        Refrigerator iceBox,
                        DishWasher dishWasher) {
        this.brewMaster = brewMaster;
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
    }

    /*public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void addWater(){

    }

    public void pourMilk(){

    }

    public void loadDishWasher(){

    }*/

    public void setKitchenState(boolean coffeeFlag,boolean fridgeFlag,
                                boolean dishWasherFlag ){

        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
