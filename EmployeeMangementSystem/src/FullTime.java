public class FullTime extends Employee{
    private double baseSalary;
    public FullTime(String name, int id, double baseSalary)
    {
        super(name, id);
        this.baseSalary=baseSalary;
    }
    @Override
    public void calculateSalary() {
        this.salary= this.baseSalary;
    }
}
