package edu.jsp.EventManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.EventManagment.dto.Person;
import edu.jsp.EventManagment.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService  personService;
	
	
	@GetMapping("/get/{id}")
	public    Person   fetchById(@PathVariable long id) {

		return personService.fetchById(id);
			
	}
	
	@GetMapping("/getall")
	public  List<Person>  getAll(){

		return  personService.getAll();
	}
	
	
	
}
