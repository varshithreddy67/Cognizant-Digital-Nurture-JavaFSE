package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // JPQL - Get Employee by ID
    @Query("SELECT e FROM Employee e WHERE e.id = :id")
    Employee getEmployee(@Param("id") int id);

    // JPQL - Get Employees by Department
    @Query("SELECT e FROM Employee e WHERE e.department.name = :department")
    List<Employee> getEmployeesByDepartment(@Param("department") String department);

    // JPQL - Salary and Permanent
    @Query("""
           SELECT e
           FROM Employee e
           WHERE e.salary > :salary
           AND e.permanent = :permanent
           ORDER BY e.salary DESC
           """)
    List<Employee> getEmployeesBySalaryAndPermanent(
            @Param("salary") Double salary,
            @Param("permanent") Boolean permanent
    );

    // Native SQL Query
    @Query(value = """
            SELECT *
            FROM employee
            WHERE em_salary > :salary
            """, nativeQuery = true)
    List<Employee> getEmployeesWithSalaryGreaterThan(
            @Param("salary") Double salary
    );
}