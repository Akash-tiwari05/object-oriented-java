package OOPs.inheritence.worker;

public class Main {
    public static void main(String[] args) {

        Employee akash = new Employee("Akash", "07/06/2000"
                ,"12/12/2025");
        System.out.println(akash);
        System.out.println("Age : "+akash.getAge());
        System.out.println("Pay : "+akash.collectPay());

        Employee aryan = new Employee("Aryan", "07/06/2007"
                ,"12/12/2025");
        System.out.println(aryan);

        SalariedEmployee joy =
                new SalariedEmployee("Akash",
                        "12/12/2022","12/12/2025",54600.00);

        System.out.println(joy);

        System.out.println("Joy Pay Check = "+joy.collectPay());
        joy.retire();
        System.out.println("Joy retired pay check = "+ joy.collectPay());

        HourlyEmployee raj = new HourlyEmployee("Raj","07/06/2001",
                "12/01/2024",350.00);

        System.out.println(raj);
        System.out.println("Hourly Pay = "+ raj.collectPay());
        System.out.println("Double Pay = "+ raj.getDoublePay());

    }
}
