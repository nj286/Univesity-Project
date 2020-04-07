package com.dbms.university.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbms.university.model.Instructor;

public interface InstructorRepository extends CrudRepository<Instructor, String> {

}
