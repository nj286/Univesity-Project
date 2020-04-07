package com.dbms.university.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbms.university.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, String>{

}
