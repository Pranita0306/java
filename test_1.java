import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Person {
    String name;
    String birthdata;
    double height;
    double weight;
    String address;

    Person(String name, String birthdata, double height, double weight, String address) {
        this.name = name;
        this.birthdata = birthdata;
        this.height = height;
        this.weight = weight;
        this.address = address;
    }

    // Method to calculate age from birthdata
    public int calculateAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(birthdata, formatter);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}

class Student extends Person {
    int roll_no;
    double mark;

    Student(String name, String birthdata, double height, double weight, String address, int roll_no, double mark) {
        super(name, birthdata, height, weight, address);
        this.roll_no = roll_no;
        this.mark = mark;
    }
}

class Employee extends Person {
    int empid;
    double salary;

    Employee(String name, String birthdata, double height, double weight, String address, int empid, double salary) {
        super(name, birthdata, height, weight, address);
        this.empid = empid;
        this.salary = salary;
    }
}




public class test_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student details:");

        System.out.print("Name: ");
        String name = s.nextLine();

        System.out.print("Birthdate (YYYY-MM-DD): ");
        String birthdata = s.nextLine();

        System.out.print("Height: ");
        double height = s.nextDouble();

        System.out.print("Weight: ");
        double weight = s.nextDouble();
        s.nextLine(); // Consume the newline character

        System.out.print("Address: ");
        String address = s.nextLine();

        System.out.print("Roll No: ");
        int roll_no = s.nextInt();

        System.out.print("Mark: ");
        double mark = s.nextDouble();s

        Student obj = new Student(name, birthdata, height, weight, address, roll_no, mark);
	  System.out.println("\n -----------student information-------------------------");
        System.out.println("\nName of student: " + obj.name);
 	  System.out.println("\nName of Height: " + obj.height);
        System.out.println("\nAge of student: " + obj.calculateAge());
	  System.out.println("\nWeight of student: " + obj.weight);
	  System.out.println("\naddress of student: " + obj.address);
	  System.out.println("\nroll_no of student: " + obj.roll_no);
   	  System.out.println("\nMark of student: " + obj.mark);



    System.out.println("\nEnter employee details:");
        System.out.print("Name: ");
        name = s.nextLine();
        System.out.print("Birthdate (YYYY-MM-DD): ");
        birthdata = s.nextLine();
        System.out.print("Height: ");
        height = s.nextDouble();
        System.out.print("Weight: ");
        weight = s.nextDouble();
        s.nextLine(); // Consume the newline character
        System.out.print("Address: ");
        address = s.nextLine();
        System.out.print("Employee ID: ");
        int empid = s.nextInt();
        System.out.print("Salary: ");
        double salary = s.nextDouble();

        Employee employee = new Employee(name, birthdata, height, weight, address, empid, salary);
        System.out.println("\n----------- Employee Information -----------");
        System.out.println("Name: " + employee.name);
        System.out.println("Height: " + employee.height);
        System.out.println("Age: " + employee.calculateAge());
        System.out.println("Weight: " + employee.weight);
        System.out.println("Address: " + employee.address);
        System.out.println("Employee ID: " + employee.empid);
        System.out.println("Salary: " + employee.salary);

        s.close();
	  
    }
}
