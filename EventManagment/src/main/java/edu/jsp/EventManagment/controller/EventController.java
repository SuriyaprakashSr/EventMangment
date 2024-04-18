package edu.jsp.EventManagment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.EventManagment.dto.Event;
import edu.jsp.EventManagment.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	EventService service;
	
	@PostMapping("/save")
	public  Event  saveEvent(@RequestBody  Event event) {
		return  service.saveEvent(event);
	}
	
	

}
