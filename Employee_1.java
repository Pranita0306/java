public class Employee {
    private String name;
    private double salary;

    // Constructor to initialize instance variables
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to raise salary by 10%
    public void raiseSalary() {
        this.salary *= 1.10;
    }

    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 50000);

        // Using getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Raising salary by 10%
        emp.raiseSalary();
        System.out.println("Employee Salary after raise: " + emp.getSalary());
    }
}