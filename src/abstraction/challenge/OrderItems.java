package abstraction.challenge;

public class OrderItems {

    private int quantity;
    private ProductForSale product;

    public OrderItems(int quantity,ProductForSale product) {
        this.product = product;
        this.quantity = quantity;
    }

    public void printOrderItems(){
        product.printPricedItems(quantity);
    }
}
