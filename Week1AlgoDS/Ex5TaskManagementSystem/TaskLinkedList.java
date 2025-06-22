package Week1AlgoDS.Ex5TaskManagementSystem;

public class TaskLinkedList {
    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    public void deleteTask(int taskId) {
        Node curr = head, prev = null;

        while (curr != null && curr.task.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Task not found.");
            return;
        }

        if (prev == null) {
            head = head.next;
        } else {
            prev.next = curr.next;
        }

        System.out.println("Task deleted.");
    }

    public void searchTask(int taskId) {
        Node curr = head;

        while (curr != null) {
            if (curr.task.taskId == taskId) {
                curr.task.display();
                return;
            }
            curr = curr.next;
        }

        System.out.println("Task not found.");
    }

    public void displayAll() {
        Node curr = head;

        while (curr != null) {
            curr.task.display();
            curr = curr.next;
        }
    }
}
