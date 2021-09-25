package com.example.controller;

import com.example.service.DepartmentService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class DepartmentController {
    @Resource(name = "departmentService")
    private DepartmentService departmentService;
}
