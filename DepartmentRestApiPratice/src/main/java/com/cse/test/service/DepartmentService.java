package com.cse.test.service;

import java.util.List;

import com.cse.test.entity.Department;



public interface DepartmentService {
	Department saveDepartment(Department department);

	List<Department> fetchDepartmentList();

	Department updateDepartment(Department department, Long departmentId);

	void deleteDepartmentById(Long departmentId);
}
