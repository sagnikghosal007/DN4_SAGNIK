package Week1AlgoDS.Ex4EmployeeManagementSystem;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee e) {
        if (size < employees.length) {
            employees[size++] = e;
        } else {
            System.out.println("Employee list is full.");
        }
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            employees[i].display();
        }
    }

    public void searchById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void deleteById(int id) {
        int i;
        for (i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                break;
            }
        }
        if (i == size) {
            System.out.println("Employee not found.");
            return;
        }
        for (int j = i; j < size - 1; j++) {
            employees[j] = employees[j + 1];
        }
        size--;
        System.out.println("Employee deleted.");
    }
}

