package com.departmentMicroservice.departmentMicroservice.service;

import com.departmentMicroservice.departmentMicroservice.entity.Department;
import com.departmentMicroservice.departmentMicroservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        log.info("Inside service and saving to repository");
        return departmentRepository.save(department);
    }

    public Department findById(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);

    }
}
