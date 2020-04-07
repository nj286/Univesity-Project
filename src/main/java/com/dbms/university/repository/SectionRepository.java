package com.dbms.university.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbms.university.model.Section;

public interface SectionRepository extends CrudRepository<Section, String> {

}
