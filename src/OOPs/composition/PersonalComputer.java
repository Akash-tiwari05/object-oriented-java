package OOPs.composition;

public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PersonalComputer(String model, String manufacturer,
                            ComputerCase computerCase,
                            Motherboard motherboard, Monitor monitor) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void logo(){
        monitor.drawPixelAt(100,100, "yellow");
    }

    private void loading(){
        motherboard.loadProgram("Window OS");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        logo();
        loading();
    }

    /*public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }*/
}
