package com.vue.shop.dto.department;

import lombok.Data;

import java.io.Serializable;

@Data
public class DepartmentOptionResDto implements Serializable {
    private Integer id;
    private String departmentName;
}
