package OOPs.bankdetails.challange;

public class Customer {

    private String name;

    private double creditLimit;

    private String email;

    /**
     * No args constructor for creating objects so for
     */
    public Customer() {
        this("Anuj","Anuj@mail.com");
    }

    public Customer(String name, String email) {
        this(name,450.00,email);
        /*this.name = name;
        this.email = email;*/
    }


    /**
     *Creates a new Customer with the specified details.
     *
     * @param name the name of the customer
     * @param creditLimit the credit limit assigned to the customer
     * @param email the email address of the customer
     */
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    /**
     * getter method used for  encapsulation
     * @return getter value
     */
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
