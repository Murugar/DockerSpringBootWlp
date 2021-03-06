package com.iqmsoft.wlp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.wlp.domain.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}