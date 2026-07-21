package com.cognizant.spring_learn.dao;

import com.cognizant.spring_learn.model.Department;
import com.cognizant.spring_learn.model.Employee;
import com.cognizant.spring_learn.model.Skill;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@Repository
public class EmployeeDao {

    private static final List<Employee> EMPLOYEE_LIST = new ArrayList<>();

    static {
        Department department1 = new Department(1, "IT");
        Department department2 = new Department(2, "HR");

        Skill skill1 = new Skill(1, "Java");
        Skill skill2 = new Skill(2, "Spring Boot");
        Skill skill3 = new Skill(3, "SQL");

        Calendar calendar = Calendar.getInstance();

        calendar.set(2002, Calendar.JANUARY, 10);
        Employee employee1 = new Employee(
                1,
                "Varshith",
                45000,
                true,
                calendar.getTime(),
                department1,
                Arrays.asList(skill1, skill2)
        );

        calendar.set(2001, Calendar.JUNE, 15);
        Employee employee2 = new Employee(
                2,
                "Rahul",
                40000,
                true,
                calendar.getTime(),
                department1,
                Arrays.asList(skill1, skill3)
        );

        calendar.set(2003, Calendar.MARCH, 20);
        Employee employee3 = new Employee(
                3,
                "Priya",
                38000,
                false,
                calendar.getTime(),
                department2,
                Arrays.asList(skill2, skill3)
        );

        EMPLOYEE_LIST.add(employee1);
        EMPLOYEE_LIST.add(employee2);
        EMPLOYEE_LIST.add(employee3);
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}