package com.cognizant.task;

public class TaskLinkedList {

    private Task head;

    public void addTask(Task task) {
        if (head == null) {
            head = task;
        } else {
            Task current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = task;
        }

        System.out.println("Task added successfully.");
    }

    public void searchTask(int taskId) {
        Task current = head;

        while (current != null) {
            if (current.taskId == taskId) {
                System.out.println("Task Found:");
                current.displayTask();
                return;
            }

            current = current.next;
        }

        System.out.println("Task not found.");
    }

    public void displayTasks() {
        Task current = head;

        while (current != null) {
            current.displayTask();
            current = current.next;
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        Task current = head;

        while (current.next != null) {
            if (current.next.taskId == taskId) {
                current.next = current.next.next;
                System.out.println("Task deleted successfully.");
                return;
            }

            current = current.next;
        }

        System.out.println("Task not found.");
    }
}