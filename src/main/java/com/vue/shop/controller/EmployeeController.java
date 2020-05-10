package com.vue.shop.controller;

import com.vue.shop.common.response.ResponseResult;
import com.vue.shop.dto.employee.EmployeeDetailResDto;
import com.vue.shop.model.Employee;
import com.vue.shop.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:8080",
        maxAge = 3600,
        methods = {RequestMethod.GET, RequestMethod.POST})
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public ResponseResult add(@RequestBody Employee employee){
        employeeService.add(employee);
        return ResponseResult.SUCCESS();
    }

    @PostMapping("/update")
    public ResponseResult update(@RequestBody Employee employee){
        employeeService.update(employee);
        return ResponseResult.SUCCESS();
    }

    @PostMapping("/delete/{id}")
    public ResponseResult update(@PathVariable("id") Integer id){
        employeeService.delete(id);
        return ResponseResult.SUCCESS();
    }

    @PostMapping("/list")
    public ResponseResult list(){
        List<EmployeeDetailResDto> list = employeeService.list();
        return ResponseResult.SUCCESS(list);
    }
}
