package com.cognizant.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(101, "Varshith", "Developer", 65000));
        manager.addEmployee(new Employee(102, "Rahul", "Tester", 50000));
        manager.addEmployee(new Employee(103, "Krishna", "Manager", 85000));

        System.out.println("\nEmployee List:");
        manager.displayEmployees();

        System.out.println("\nSearching Employee:");
        manager.searchEmployee(102);

        manager.deleteEmployee(101);

        System.out.println("\nAfter Deletion:");
        manager.displayEmployees();
    }
}