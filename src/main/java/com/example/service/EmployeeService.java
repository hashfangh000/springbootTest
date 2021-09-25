package com.example.service;


import com.example.pojo.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> queryEmployeesList();

    Employee queryEmployeeById(Integer id);

    int addEmployee(Employee Employee);

    int updateEmployee(Employee Employee);

    int deleteEmployee(int id);
}
