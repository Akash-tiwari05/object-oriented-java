package composition;

public class Main {

    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("7708","Dell",
                "240");

        Monitor theMonitor = new Monitor("27inch Beast","Acer",
                27,"2550X1440");

        Motherboard motherboard = new Motherboard("BJ-2000","Asus",
                4,6, "v2.22");


        PersonalComputer thePc = new PersonalComputer("2208","Dell",
                computerCase, motherboard,theMonitor);

        /*thePc.getMonitor().drawPixelAt(10,10,"red");
        thePc.getMotherboard().loadProgram("Window OS");
        thePc.getComputerCase().pressPowerButton();*/

        thePc.powerUp();
    }
}
