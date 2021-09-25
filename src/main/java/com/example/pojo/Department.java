package com.example.pojo;

import lombok.*;

//部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    Integer id;
    private String departmentName;
}
