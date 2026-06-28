package com.cognizant.mvc;

public class MVCTest {

    public static void main(String[] args) {

        Student model = new Student("Varshith", "12345");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Krishna");

        controller.setStudentRollNo("54321");

        controller.updateView();
    }
}