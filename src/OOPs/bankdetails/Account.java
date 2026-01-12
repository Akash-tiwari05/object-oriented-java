package OOPs.bankdetails;

public class Account {

    private String accountNumber;

    private double accountBalance;

    private String customerName;

    private String customerEmail;

    private String customerPhoneNumber;


    public Account(){
        /**
         * this constructor chaining or simply known as constructor overloading
         */
        this("123450",2345.00, "Avyaan",
                "Avyaan@mail.com","43543763");
        System.out.println("No-args constructor called...");
    }

    public Account(String accountNumber, double accountBalance, String customerName,
                   String customerEmail, String customerPhoneNumber) {
        System.out.println("All-args constructor called here ...");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        /*System.out.println(accountNumber);
        System.out.println(accountBalance);
        System.out.println(customerName);
        System.out.println(customerEmail);
        System.out.println(customerPhoneNumber);*/
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositBalance(double depositAmount){
        double totalBalance = accountBalance+ depositAmount;
        System.out.println("Your Current account balance = "+accountBalance+
                "\nAdded to your account "+ depositAmount+
                        "\nTotal balance on your bank account is = "+
                totalBalance);
        accountBalance = totalBalance;
    }

    public void withdrawalBalance(double withdrawalAmount){
        if(accountBalance <= 0.0 || accountBalance < withdrawalAmount){
            System.out.println("Amount balance is negative..");
        }
        else{
            double totalBalance = accountBalance - withdrawalAmount;
            System.out.println("Your Current account balance = "+accountBalance+
                    "\nAdded to your account "+ withdrawalAmount+
                    "\nTotal balance on your bank account is = "+
                    totalBalance);
            accountBalance = totalBalance;
        }
    }
}
