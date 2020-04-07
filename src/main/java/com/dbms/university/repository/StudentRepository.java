package com.dbms.university.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbms.university.model.Student;

public interface StudentRepository extends CrudRepository<Student, String>{

}
