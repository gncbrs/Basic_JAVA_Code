//Coded by Gönenç Barış Bezik

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class to_do_list {

    private static final String FILE_NAME = "to_do_list.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("To-Do List Menu: ");
        System.out.println("\n1. Add a new task");
        System.out.println("\n2. View tasks");
        System.out.println("\n3. Delete a task");
        System.out.println("\n4. Clear all tasks");
        System.out.println("\n5. Show Menu");
        System.out.println("\n6. Exit");
    }

    public static void add_new_task() {
        System.out.println("Enter the name of the task: ");
        String task = scanner.nextLine();

        System.out.print("Enter category or priority (e.g., Work, Urgent, Low): ");
        String category = scanner.nextLine();

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String formattedTask = String.format("[%s] %s (added on %s)", category, task, timestamp);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(formattedTask);
            writer.newLine();
            System.out.printf("Task '%s' added under '%s' category.%n", task, category);
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static List<String> readTasks() {
        try {
            return Files.readAllLines(Paths.get(FILE_NAME));
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public static void viewTasks() {
        List<String> tasks = readTasks();

        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("\nTo-Do List:");

            for (int i = 0; i < tasks.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, tasks.get(i));
            }

        }
    }

    public static void deleteTask() {
        List<String> tasks = readTasks();

        System.out.print("Enter the task (or part of it) to delete: ");
        String input = scanner.nextLine().toLowerCase();

        // Find the first task that matches the input (case-insensitive)
        String taskToDelete = null;
        for (String task : tasks) {
            if (task.toLowerCase().contains(input)) {
                taskToDelete = task;
                break;
            }
        }

        if (taskToDelete == null) {
            System.out.printf("No task found containing '%s'.%n", input);
            return;
        }

        tasks.remove(taskToDelete);

        try {
            Files.write(Paths.get(FILE_NAME), tasks);
            System.out.printf("Task '%s' has been deleted.%n", taskToDelete);
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
        }
    }

    public static void clearAllTasks() {
        List<String> tasks = readTasks();

        System.out.println("Are you sure you want to delete all the tasks?(yes/no) ");
        String input = scanner.nextLine().toLowerCase();

        if (input.equals("yes")) {
            try {
                Files.write(Paths.get(FILE_NAME), new ArrayList<>());
                System.out.println("All tasks have been deleted.");
            } catch (IOException e) {
                System.out.println("An error occurred while updating the file.");

            }
        }

    }

    public static void main(String[] args) {
        boolean running = true;
        showMenu();

        while (running) {
            System.out.print("\nEnter your operation number (1-6): ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    add_new_task();
                    break;
                case "2":
                    viewTasks();
                    break;
                case "3":
                    deleteTask();
                    break;
                case "4":
                    clearAllTasks();
                    break;
                case "5":
                    showMenu();
                    break;
                case "6":
                    System.out.println("Have a great time completing your tasks!");
                    running = false; // cleanly exits loop
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 6.");
            }
        }
    }

}
