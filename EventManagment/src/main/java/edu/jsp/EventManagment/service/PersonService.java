package edu.jsp.EventManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.EventManagment.dao.PersonDao;
import edu.jsp.EventManagment.dto.Person;

@Service
public class PersonService {

	@Autowired
	PersonDao dao;
	
	public    Person   fetchById(long id) {

			return dao.fetchById(id);
	}
	
	public  List<Person>  getAll(){
		
		return   dao.getAll();
		
	}
	
	
	
}
