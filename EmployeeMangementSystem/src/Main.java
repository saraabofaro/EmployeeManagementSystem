public class Main {
    public static void main(String[] args) {

        Employee employee1= new FullTime("Joe", 124, 20000);
        Employee employee2= new PartTime("Joe", 124, 150, 200);

        employee1.calculateSalary();
        employee2.calculateSalary();
        System.out.println(employee1);
        System.out.println(employee2);

    }
}