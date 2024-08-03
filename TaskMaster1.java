import java.util.ArrayList;
import java.util.Scanner;

public class TaskMaster1 {

    static class Task {
        String description;
        int quadrant; // 1: Urgent & Important, 2: Not Urgent but Important, 3: Urgent but Not Important, 4: Not Urgent & Not Important
        Task(String description, int quadrant) {
            this.description = description;
            this.quadrant = quadrant;
        }

            @Override
        public String toString() {
            return description;
        }
    }

    private static final ArrayList<Task> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.println("Select quadrant:");
        System.out.println("1. Urgent & Important");
        System.out.println("2. Not Urgent but Important");
        System.out.println("3. Urgent but Not Important");
        System.out.println("4. Not Urgent & Not Important");
        System.out.print("Enter quadrant number: ");
        int quadrant = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (quadrant < 1 || quadrant > 4) {
            System.out.println("Invalid quadrant. Task not added.");
            return;
        }

        tasks.add(new Task(description, quadrant));
        System.out.println("Task added successfully.");
    }

    private static void viewTasks() {
        System.out.println("Viewing tasks by quadrant:");
        for (int i = 1; i <= 4; i++) {
            System.out.println("\nQuadrant " + i + ":");
            boolean found = false;
            for (Task task : tasks) {
                if (task.quadrant == i) {
                    System.out.println("- " + task);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No tasks in this quadrant.");
            }
        }
    }

    private static void removeTask() {
        System.out.println("Enter task description to remove: ");
        String description = scanner.nextLine();

        boolean removed = tasks.removeIf(task -> task.description.equals(description));
        if (removed) {
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }
}


