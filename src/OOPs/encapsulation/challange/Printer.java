package OOPs.encapsulation.challange;

public class Printer {

    private int tonerLevel;
    private int printedPages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        this.printedPages = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel:-1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        if(tempAmount < 0 || tempAmount > 100) {
            return  -1;
        }
        tonerLevel += tonerAmount;
        //System.out.println("Toner Level = "+tonerLevel);
        return tonerLevel;
    }

    public int printPages(int pages){

        int jobPages = (duplex)?(pages/2) + (pages% 2): pages;
        printedPages += jobPages;
        return jobPages;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
