package com.departmentMicroservice.departmentMicroservice.controller;

import com.departmentMicroservice.departmentMicroservice.entity.Department;
import com.departmentMicroservice.departmentMicroservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/add")
    public Department saveDepartment(@RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long departmentId)
    {
        return departmentService.findById(departmentId);
    }
}
