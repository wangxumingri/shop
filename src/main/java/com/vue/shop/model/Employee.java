package com.vue.shop.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tbl_emp")
public class Employee implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String gender;
    private String age;
    @Column(name = "deptId")
    private Integer departmentId;
}
