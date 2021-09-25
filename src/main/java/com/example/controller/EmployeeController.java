package com.example.controller;

import com.example.dao.DepartmentDao;
import com.example.dao.EmployeeDao;
import com.example.mapper.EmployeeMapper;
import com.example.pojo.Department;
import com.example.pojo.Employee;
import com.example.service.DepartmentService;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Controller
public class EmployeeController {
    @Resource(name = "employeeService")
    private EmployeeService employeeService;

    @Resource(name = "departmentService")
    private DepartmentService departmentService;
    @RequestMapping("/emps")
    public String list(Model model){
        //emps查看员工
        Collection<Employee> employees = employeeService.queryEmployeesList();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddpage(Model model){
        //emp添加员工
        Collection<Department> departments = departmentService.queryDepartmentsList();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //添加员工
        System.out.println(employee);
        System.out.println("save==>" + employee);
        employeeService.addEmployee(employee);
        return "redirect:/emps";
    }

    //去员工的修改页面
    @GetMapping("/emp/{id}")
    public String toupdateEmp(@PathVariable("id")Integer id, Model model){
        //查询员工
        Employee employee = employeeService.queryEmployeeById(id);
        Collection<Department> departments = departmentService.queryDepartmentsList();
        model.addAttribute("departments",departments);
        model.addAttribute("emp",employee);
        return "emp/update";
    }

    //修改
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        System.out.println(employee);
        employeeService.updateEmployee(employee);
        return "redirect:/emps";
    }
    //删除员工
    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id")Integer id){
        employeeService.deleteEmployee(id);
        return "redirect:/emps";
    }
}
