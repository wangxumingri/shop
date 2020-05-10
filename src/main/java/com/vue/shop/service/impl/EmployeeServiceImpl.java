package com.vue.shop.service.impl;

import com.vue.shop.common.exception.ExceptionCastUtil;
import com.vue.shop.common.response.CommonCode;
import com.vue.shop.dao.EmployeeRepository;
import com.vue.shop.dto.employee.EmployeeDetailResDto;
import com.vue.shop.model.Employee;
import com.vue.shop.service.DepartmentService;
import com.vue.shop.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentService departmentService;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository,DepartmentService departmentService) {
        this.employeeRepository = employeeRepository;
        this.departmentService = departmentService;
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void update(Employee employee) {
        if (!employeeRepository.findById(employee.getId()).isPresent()){
            ExceptionCastUtil.cast(CommonCode.DATA_NOT_EXIST);
        }
        employeeRepository.save(employee);
    }

    @Override
    public void delete(Integer id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (!optionalEmployee.isPresent()){
            ExceptionCastUtil.cast(CommonCode.DATA_NOT_EXIST);
        }
        employeeRepository.deleteById(id);
    }

    @Override
    public List<EmployeeDetailResDto> list() {
//    Pageable pageable = PageRequest.of(page, size);
    // 根据页面别名模糊查询
//    ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());
//    Example<Employee> example = Example.of(employee, exampleMatcher);
    // 查询结果
        List<EmployeeDetailResDto> resDtoList = new ArrayList<>();
        List<Employee> list = employeeRepository.findAll();
        if (list != null && list.size() > 0){
            for (Employee employee : list) {
                EmployeeDetailResDto resDto = new EmployeeDetailResDto();
                BeanUtils.copyProperties(employee,resDto);
                if (employee.getDepartmentId() != null){
                    resDto.setDepartmentName(departmentService.getDepartmentName(employee.getDepartmentId()));
                }
                resDtoList.add(resDto);
            }
        }

        return resDtoList;

    }
}
