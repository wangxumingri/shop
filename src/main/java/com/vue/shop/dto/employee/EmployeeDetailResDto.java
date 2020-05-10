package com.vue.shop.dto.employee;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDetailResDto implements Serializable {
    private Integer id;
    private String name;
    private String gender;
    private String age;
    private Integer departmentId;
    private String departmentName;
}
