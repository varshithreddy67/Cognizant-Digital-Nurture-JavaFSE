package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;

@Service
public class EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public List<Employee> getEmployeesCriteria() {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Employee> cq =
                cb.createQuery(Employee.class);

        Root<Employee> employee =
                cq.from(Employee.class);

        cq.select(employee);

        return entityManager
                .createQuery(cq)
                .getResultList();
    }

    @Transactional(readOnly = true)
    public List<Employee> getEmployeesCriteriaBySalary(Double salary) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

        Root<Employee> employee = cq.from(Employee.class);

        cq.select(employee)
                .where(cb.greaterThan(employee.get("salary"), salary));

        return entityManager.createQuery(cq).getResultList();
    }

    @Transactional(readOnly = true)
    public Employee getEmployee(int id) {

        Employee employee = employeeRepository.getEmployee(id);

        if (employee != null) {
            employee.getSkills().size();
        }

        return employee;
    }

    @Transactional(readOnly = true)
    public List<Employee> getEmployeesCriteriaOrderBySalary() {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

        Root<Employee> employee = cq.from(Employee.class);

        cq.select(employee)
                .orderBy(cb.desc(employee.get("salary")));

        return entityManager.createQuery(cq).getResultList();
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