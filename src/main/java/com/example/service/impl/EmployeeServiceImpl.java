package com.example.service.impl;

import com.example.mapper.EmployeeMapper;
import com.example.pojo.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> queryEmployeesList() {
        return employeeMapper.queryEmployeesList();
    }

    @Override
    public Employee queryEmployeeById(Integer id) {
        return employeeMapper.queryEmployeeById(id);
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public int deleteEmployee(int id) {
        return employeeMapper.deleteEmployee(id);
    }
}
