package edu.jsp.EventManagment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.EventManagment.dto.Person;

public interface PersonRepo  extends  JpaRepository<Person, Long> {

}
