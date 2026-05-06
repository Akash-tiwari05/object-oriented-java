package abstraction.challenge;

public abstract class ProductForSale {

    protected String type;

    protected double price;

    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return quantity*price;
    }

    public void printPricedItems(int quantity){

        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s Total: $%8.2f %n",
                quantity, price, type, description, getSalesPrice(quantity));
    }

    //abstract methods
    public abstract void showDetails();
}
