package com.example.service.impl;

import com.example.mapper.DepartmentMapper;
import com.example.pojo.Department;
import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> queryDepartmentsList() {
        return departmentMapper.queryDepartmentsList();
    }

    @Override
    public Department queryDepartmentById(Integer id) {
        return departmentMapper.queryDepartmentById(id);
    }
}
