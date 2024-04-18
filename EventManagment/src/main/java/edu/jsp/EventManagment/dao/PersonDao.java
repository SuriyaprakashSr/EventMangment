package edu.jsp.EventManagment.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.EventManagment.dto.Person;
import edu.jsp.EventManagment.repo.PersonRepo;

@Repository
public class PersonDao {

	@Autowired
	PersonRepo personRepo;
	
	
	public    Person   fetchById(long id) {
		Optional<Person>  o  =    personRepo.findById(id);
		
		if(o.isPresent()) {
			return  o.get();
		}
		return null;
	}
	
	
	public  List<Person>  getAll(){
		return  personRepo.findAll();
	}
	
	
	
	
}


