package org.example;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public TaskManager() {

    }

    public void addTask(Task task) {
        if (task == null) {
            System.out.println("task is null");
            return;
        }
        tasks.add(task);
        System.out.println("task added " + task.getTitle());
    }

    public boolean deleteTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                System.out.println("task removed" + task.getTitle());
                return true;
            }
        }
        System.out.println("task not found");
        return false;
    }

    public void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found");
            return;
        }
        System.out.println("Tasks: ");
        tasks.forEach(System.out::println);
    }

    public void writeToFile(List<Task> tasks, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Task task : tasks) {
                writer.write(task.getId() + ";" + task.getTitle() + ";" + task.isCompleted());
                writer.newLine();
            }
            System.out.println("Tasks written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error while writing to file " + e.getMessage());
        }
    }

    public List<Task> readFromFile(String fileName) {
        List<Task> tasks = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");
                if (tokens.length == 3) {
                    String id = String.valueOf(Integer.parseInt(tokens[0]));
                    String title = tokens[1];
                    boolean completed = Boolean.parseBoolean(tokens[2]);
                    tasks.add(new Task(id, title, completed));
                }
            }
            System.out.println("Tasks read succesfully from " + fileName);
        } catch (IOException e) {
            System.out.println("Error while reading file " + e.getMessage());
        }
        return tasks;
    }


}
