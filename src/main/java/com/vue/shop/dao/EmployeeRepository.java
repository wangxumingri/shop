package com.vue.shop.dao;

import com.vue.shop.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
