package OOPs.bankdetails.challange;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Aryan",4500.00 ,
                "example@mail.com");

        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());
        System.out.println(customer.getName());

        Customer newCustomer = new Customer();
        System.out.println(newCustomer.getCreditLimit());
        System.out.println(newCustomer.getEmail());
        System.out.println(newCustomer.getName());
    }
}
