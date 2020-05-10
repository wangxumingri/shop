package com.vue.shop.service;

import com.vue.shop.dto.employee.EmployeeDetailResDto;
import com.vue.shop.model.Employee;

import java.util.List;


public interface EmployeeService {
    void add(Employee employee);

    void update(Employee employee);

    void delete(Integer id);

    List<EmployeeDetailResDto> list();
}
