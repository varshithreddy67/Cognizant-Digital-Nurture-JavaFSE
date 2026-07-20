package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public Employee getEmployee(int id) {

        Employee employee = employeeRepository.getEmployee(id);

        if (employee != null) {
            employee.getSkills().size();
        }

        return employee;
    }
    @Transactional(readOnly = true)
    public List<Employee> getEmployeesBySalaryAndPermanent(
            Double salary,
            Boolean permanent) {

        return employeeRepository
                .getEmployeesBySalaryAndPermanent(salary, permanent);
    }

    @Transactional(readOnly = true)
    public List<Employee> getEmployeesByDepartment(String department) {
        return employeeRepository.getEmployeesByDepartment(department);
    }
    @Transactional(readOnly = true)
    public List<Employee> getEmployeesWithSalaryGreaterThan(Double salary) {
        return employeeRepository.getEmployeesWithSalaryGreaterThan(salary);
    }
}