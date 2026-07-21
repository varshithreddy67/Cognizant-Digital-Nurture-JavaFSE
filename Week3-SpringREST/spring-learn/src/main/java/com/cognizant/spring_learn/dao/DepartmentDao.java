package com.cognizant.spring_learn.dao;

import com.cognizant.spring_learn.model.Department;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class DepartmentDao {

    private static final List<Department> DEPARTMENT_LIST = Arrays.asList(
            new Department(1, "IT"),
            new Department(2, "HR"),
            new Department(3, "Finance"),
            new Department(4, "Admin")
    );

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}