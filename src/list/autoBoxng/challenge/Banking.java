package list.autoBoxng.challenge;

import java.util.ArrayList;
import java.util.Locale;

record Customer(String name, ArrayList<Double> transections){

    public Customer(String name, double initialDeposit){
        this(name.toLowerCase(),
                new ArrayList<>(500));
        transections.add(initialDeposit);
    }
}

public class Banking {

    public static void main(String[] args) {
        Customer akash = new Customer("Akash",500);
        System.out.println(akash);

        Bank bank = new Bank("Sbi");
        bank.addNewCustomer("Aryan",700);
        System.out.println(bank);

        bank.addTransition("Aryan",560);
        bank.printStatement("Aryan");
    }
}

class Bank{

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);


    public Bank(String name){
        this.name = name;
    }

    private Customer getCustomer(String customerName){

        for (var customer : customers){
            if(customer.name().equalsIgnoreCase(customerName)){
               return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n",customerName);

        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public void addNewCustomer(String customerName, double initialAmount){
        if(getCustomer(customerName) == null){
            Customer customer = new Customer(customerName,initialAmount);
            customers.add(customer);
            System.out.println("New Customer add: "+customer);
        }
    }

    public void addTransition(String customerName, double transactionAmount){

        Customer customer = getCustomer(customerName);
        if (customer != null) {
            customer.transections().add(transactionAmount);
        }
    }

    public void printStatement(String customerName){

        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }

        System.out.println("-".repeat(50));
        System.out.println("Customer name: "+customerName);
        System.out.println("Transactions");

        for (double d: customer.transections()){
            System.out.printf("$%10.2f (%s)%n",d, d < 0 ? "debt":"creadit");
        }
    }

}