package Week1AlgoDS.Ex5TaskManagementSystem;

public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskLinkedList list = new TaskLinkedList();

        list.addTask(new Task(1, "Write Report", "Your Task is PENDING!"));
        list.addTask(new Task(2, "Test Code", "Your Task is COMPLETED"));
        list.addTask(new Task(3, "Deploy App", "Your Task is IN PROGRESS"));

        System.out.println("All Tasks:");
        list.displayAll();

        System.out.println("\nSearch Task ID 2:");
        list.searchTask(2);

        System.out.println("\nDelete Task ID 1:");
        list.deleteTask(1);

        System.out.println("\nAll Tasks After Deletion:");
        list.displayAll();
    }
}
