package OOPs.bankdetails;

public class Bank {
    public static void main(String[] args) {



        Account account = new Account();

        account.depositBalance(5400.70);
        account.withdrawalBalance(2500.45);

        account.setAccountNumber("1234567");
        account.setAccountBalance(4000.00);
        account.setCustomerName("Akash");
        account.setCustomerEmail("example@mail.com");
        account.setCustomerPhoneNumber("6306354553");
        account.depositBalance(1400.50);
        account.withdrawalBalance(1470.50);

        /*Account akash = new Account("Akash",2343,
                "Akdd","adiasif",
                "ajb");*/
    }
}
