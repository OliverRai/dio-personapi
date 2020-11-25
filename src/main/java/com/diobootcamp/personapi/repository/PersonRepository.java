package com.diobootcamp.personapi.repository;

import com.diobootcamp.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
