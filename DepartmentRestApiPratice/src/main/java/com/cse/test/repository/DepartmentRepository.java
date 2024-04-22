package com.cse.test.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cse.test.entity.Department;


//@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

	Optional<Department> findById(Long departmentId);

	void deleteById(Long departmentId);

}
