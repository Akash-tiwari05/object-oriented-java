package OOPs.encapsulation.challange;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("Toner Level = "+ printer.addToner(25));
        System.out.println("Initial number of pages = "+printer.getPrintedPages());

        int printedPages = printer.printPages(5);
        System.out.printf("Current Job pages: %d, Printer total: %d %n",
                printedPages, printer.getPrintedPages());

        printedPages = printer.printPages(10);
        System.out.printf("Current Job pages: %d, Printer total: %d %n",
                printedPages, printer.getPrintedPages());
    }
}
