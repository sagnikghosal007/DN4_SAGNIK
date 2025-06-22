package Week1AlgoDS.Ex4EmployeeManagementSystem;

public class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void display() {
        System.out.println(employeeId + " | " + name + " | " + position + " | $" + salary);
    }
}
