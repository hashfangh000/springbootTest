package com.example.pojo;

import lombok.*;

import java.util.Date;

//员工表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;     //0 nv 1 nan

    private String department;
    private Date birth;
//    public Employee(Integer id, String lastName, String email, Integer gender, String department) {
//        this.id = id;
//        this.lastName = lastName;
//        this.email = email;
//        this.gender = gender;
//        this.department = department;
//        this.birth =
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", department='" + department + '\'' +
                ", birth=" + birth +
                '}';
    }
}
