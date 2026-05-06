package abstraction.challenge;

public class Furniture extends ProductForSale{
    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a beautiful addition to any room.");
        System.out.printf("The price of the item is $%6.2f %n", price);
        System.out.println(description);
    }
}
