package Week1AlgoDS.Ex4EmployeeManagementSystem;

public class Test {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(10);

        system.addEmployee(new Employee(1001, "Sagnik", "Manager", 100000));
        system.addEmployee(new Employee(1002, "Ankur", "Cloud Architect", 78000));
        system.addEmployee(new Employee(1003, "Devesh", "Full Stack Developer", 44000));

        System.out.println("All Employees:");
        system.displayAll();

        System.out.println("\nSearch Employee ID 102:");
        system.searchById(1002);

        System.out.println("\nDelete Employee ID 101:");
        system.deleteById(1003);

        System.out.println("\nAll Employees after Deletion:");
        system.displayAll();
    }
}
