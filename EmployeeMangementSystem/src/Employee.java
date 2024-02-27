abstract class Employee {
    protected String name;
    private int id;
    protected double salary;
    public Employee(String name, int id)
    {
        this.name= name;
        this.id = id;
    }
    public abstract void calculateSalary();

    public String toString()
    {
        return "Employee {" +
                "Name: '" + name + '\'' +
                ", ID: '" + id + '\'' +
                ", Salary: '" + salary +
                '}';
    }

}
