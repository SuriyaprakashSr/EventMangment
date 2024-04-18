package edu.jsp.EventManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.EventManagment.dto.Ticket;
import edu.jsp.EventManagment.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	TicketService service;
	
	
	@PostMapping("/save")
	public   Ticket  saveTicket(@RequestBody  Ticket ticket) {
		
		return  service.saveTicket(ticket);
	}
	
	@GetMapping("/get/{age}")
	public  List<Ticket>   fetchAllTicketByAge(@PathVariable int age){
		
		return  service.fetchAllTicketByAge(age);
	}
	
	

}
