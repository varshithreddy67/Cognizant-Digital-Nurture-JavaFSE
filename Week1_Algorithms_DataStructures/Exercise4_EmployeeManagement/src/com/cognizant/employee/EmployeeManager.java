package com.cognizant.employee;

public class EmployeeManager {

    Employee[] employees = new Employee[10];
    int count = 0;

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count < employees.length) {
            employees[count] = employee;
            count++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee array is full.");
        }
    }

    // Search Employee
    public void searchEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {
                System.out.println("Employee Found:");
                employees[i].displayEmployee();
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Display Employees
    public void displayEmployees() {

        for (int i = 0; i < count; i++) {
            employees[i].displayEmployee();
        }
    }

    // Delete Employee
    public void deleteEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}