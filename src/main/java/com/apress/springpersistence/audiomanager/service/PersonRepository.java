package com.apress.springpersistence.audiomanager.service;

import com.apress.springpersistence.audiomanager.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
