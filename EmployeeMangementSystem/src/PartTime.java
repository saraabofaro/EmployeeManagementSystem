public class PartTime extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    public PartTime(String name, int id, double hourlyRate, int hoursWorked)
    {
        super(name, id);
        this.hourlyRate= hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        this.salary = this.hourlyRate * this.hoursWorked;
    }
}
