package com.cognizant.task;

public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(101, "Complete Java Assignment", "Pending"));
        taskList.addTask(new Task(102, "Attend Cognizant Session", "Completed"));
        taskList.addTask(new Task(103, "Upload Code to GitHub", "Pending"));

        System.out.println("\nTask List:");
        taskList.displayTasks();

        System.out.println("\nSearching Task:");
        taskList.searchTask(102);

        taskList.deleteTask(101);

        System.out.println("\nAfter Deletion:");
        taskList.displayTasks();
    }
}