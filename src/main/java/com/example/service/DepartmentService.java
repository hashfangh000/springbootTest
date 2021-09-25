package com.example.service;

import com.example.pojo.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> queryDepartmentsList();

    Department queryDepartmentById(Integer id);
}
