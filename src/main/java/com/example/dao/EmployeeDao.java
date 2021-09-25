package com.example.dao;

import com.example.pojo.*;
import com.example.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

//员工dao
@Repository
public class EmployeeDao {
//    //模拟数据
//    private static Map<Integer, Employee> employees = null;
//    @Autowired
//    private DepartmentDao departmentDao;
//    static {
//        employees = new HashMap<Integer, Employee>();
//        employees.put(1001, new Employee(1001,"张山","1475@qq.com",1, new Department(101,"教学部")));
//        employees.put(1002, new Employee(1002,"1432","1dasdas@qq.com",1, new Department(102,"体育部")));
//        employees.put(1003, new Employee(1003,"aa","das@qq.com",1, new Department(103,"运营部")));
//        employees.put(1004, new Employee(1004,"czxczx","1321@qq.com",1, new Department(104,"研发部")));
//        employees.put(1005, new Employee(1005,"zcx","dasdas@qq.com",0, new Department(105,"后勤部")));
//    }
    //增加员工
//    private static Integer initId = 1006;
//    public void save(Employee employee){
//        if (employee.getId() == null){
//            employee.setId(initId++);
//        }
//        employee.setDepartment(departmentDao.getDepartmentByid((employee.getDepartment().getId())));
//        employees.put(employee.getId(),employee);
//    }
//    //查询全部员工
//    public Collection<Employee> getAllEmployee(){
//        return employees.values();
//    }
//    //通过id查询员工
//    public Employee getEmployeeByid(Integer id){
//        return employees.get(id);
//    }
//    //删除员工
//    public void  deleteEmployee(Integer id){
//        employees.remove(id);
//    }
}
