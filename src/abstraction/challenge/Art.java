package abstraction.challenge;

public class Art extends ProductForSale {
    public Art(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a unique piece of art.");
        System.out.printf("The price of the item is $%6.2f %n", price);
        System.out.println(description);
    }
}
