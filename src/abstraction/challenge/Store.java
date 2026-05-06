package abstraction.challenge;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {


        //list of product for sale
        //list of orderItems
        //add an item to the Order
        //print the orderItems
        ArrayList<OrderItems> order = new ArrayList<>();

        // 2. Instantiate different products using our subclasses
        ProductForSale chair = new Furniture("Chair", 45.00, "Ergonomic office chair");
        ProductForSale table = new Furniture("Table", 150.50, "Oak dining table");
        ProductForSale painting = new Art("Oil Painting", 500.00, "Sunset over the ocean");

        // 3. Add these products to our order list with specific quantities
        order.add(new OrderItems(4, chair));
        order.add(new OrderItems(1, table));
        order.add(new OrderItems(2, painting));

        // 4. Print the order header
        System.out.println("-".repeat(80));
        System.out.printf("%-60s %s%n", "ITEMIZED ORDER", "TOTALS");
        System.out.println("-".repeat(80));

        // 5. Display itemized details for each order item
        double totalOrderPrice = 0;
        for (OrderItems item : order) {
            item.printOrderItems();
        }

        System.out.println("-".repeat(80));

        // 6. Show detailed product page descriptions using polymorphism
        System.out.println("\nPRODUCT CATALOG DETAILS:");
        chair.showDetails();
        System.out.println();
        painting.showDetails();
    }
}
