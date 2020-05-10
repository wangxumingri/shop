package com.vue.shop.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tbl_dept")
public class Department implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "deptName")
    private String departmentName;
    @Column(name = "locAdd")
    private String locationAddress;
}
