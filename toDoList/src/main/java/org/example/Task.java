package org.example;

public class Task {
    private static int taskId = 1;
    private final int id;
    private String taskName;
    private String taskDescription;
    private boolean isCompleted;

    public Task(String taskName, String taskDescription, boolean isCompleted) {
        this.id = taskId++;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
