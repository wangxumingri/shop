package com.vue.shop.service.impl;

import com.vue.shop.dao.DepartmentRepository;
import com.vue.shop.dto.department.DepartmentOptionResDto;
import com.vue.shop.model.Department;
import com.vue.shop.service.DepartmentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public String getDepartmentName(Integer departmentId) {
        Optional<Department> optionalDepartment = departmentRepository.findById(departmentId);
        return optionalDepartment.map(Department::getDepartmentName).orElse(null);
    }

    @Override
    public List<DepartmentOptionResDto> getOption() {
        List<DepartmentOptionResDto> resDtoList = new ArrayList<>();
        List<Department> departmentList = departmentRepository.findAll();
        for (Department department : departmentList) {
            DepartmentOptionResDto resDto = new DepartmentOptionResDto();
            BeanUtils.copyProperties(department,resDto);

            resDtoList.add(resDto);
        }

        return resDtoList;
    }
}
