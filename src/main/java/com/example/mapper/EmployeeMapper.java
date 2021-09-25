package com.example.mapper;

import com.example.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    List<Employee> queryEmployeesList();

    Employee queryEmployeeById(Integer id);

    int addEmployee(Employee Employee);

    int deleteEmployee(int id);

    int updateEmployee(Employee Employee);
}
