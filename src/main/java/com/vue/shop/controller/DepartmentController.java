package com.vue.shop.controller;

import com.vue.shop.common.response.ResponseResult;
import com.vue.shop.dto.department.DepartmentOptionResDto;
import com.vue.shop.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@CrossOrigin(origins = "http://localhost:8080",
        maxAge = 3600,
        methods = {RequestMethod.GET, RequestMethod.POST})
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/option")
    public ResponseResult getOption(){
        List<DepartmentOptionResDto> option = departmentService.getOption();
        return ResponseResult.SUCCESS(option);
    }
}
