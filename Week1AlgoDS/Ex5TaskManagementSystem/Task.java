package Week1AlgoDS.Ex5TaskManagementSystem;

public class Task {
    int taskId;
    String taskName;
    String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public void display() {
        System.out.println("Task ID: " + taskId + ", Name: " + taskName + ", Status: " + status);
    }
}
