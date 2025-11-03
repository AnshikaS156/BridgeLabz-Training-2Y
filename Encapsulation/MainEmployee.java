import java.util.*;

interface Department {
    void assignDepartment(String dept);
    void getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor using encapsulation
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + 5000; // fixed allowance
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;

    public PartTimeEmployee(int id, String name, double baseSalary, int workHours) {
        super(id, name, baseSalary);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * workHours;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        FullTimeEmployee e1 = new FullTimeEmployee(101, "Anshika", 30000);
        e1.assignDepartment("IT");

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Riya", 500, 40);
        e2.assignDepartment("Support");

        empList.add(e1);
        empList.add(e2);

        for (Employee e : empList) {
            e.displayDetails();
            System.out.println("Calculated Salary: ₹" + e.calculateSalary());
            if (e instanceof Department d) d.getDepartmentDetails();
            System.out.println("---------------------------------");
        }
    }
}
