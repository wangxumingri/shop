package com.vue.shop.service;

import com.vue.shop.dto.department.DepartmentOptionResDto;

import java.util.List;

public interface DepartmentService {
    /**
     * 查询部门名称
     * @param departmentId
     * @return
     */
    String getDepartmentName(Integer departmentId);


    /**
     * 获取下拉框
     * @return
     */
    List<DepartmentOptionResDto> getOption();
}
