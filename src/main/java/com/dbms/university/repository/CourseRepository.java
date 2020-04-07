package com.dbms.university.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbms.university.model.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

}
