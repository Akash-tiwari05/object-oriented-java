package OOPs.inheritence.worker;

public class SalariedEmployee extends Employee{

    private double annualSalary;

    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate,
                             double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = (int)annualSalary/26;
        double adjustPaycheck = (isRetired) ? 0.9 * payCheck :payCheck;

        return adjustPaycheck;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
