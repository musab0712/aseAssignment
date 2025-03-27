import java.util.ArrayList;
import java.util.List;

// Employee class definition
class Employee {
    // Private attributes
    private int id;
    private String name;
    private double salary;
    
    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + String.format("%.2f Rupees", salary));
        System.out.println("------------------------");
    }
}

public class EmployeeMngtSys {
    public static void main(String[] args) {
        // Create a list to store employees
        List<Employee> employees = new ArrayList<>();
        
        // Create employee objects
        Employee emp1 = new Employee(1, "Musab Hassan", 50000.00);
        Employee emp2 = new Employee(2, "Rajesh Kushwaha", 60000.50);
        Employee emp3 = new Employee(3, "Munawar Ali", 55000.75);
        
        // Add employees to the list
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        
        // Display details of all employees
        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}