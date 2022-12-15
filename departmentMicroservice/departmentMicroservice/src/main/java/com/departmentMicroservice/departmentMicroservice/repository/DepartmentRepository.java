package com.departmentMicroservice.departmentMicroservice.repository;

import com.departmentMicroservice.departmentMicroservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentId(Long departmentId);
}
