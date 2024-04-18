package edu.jsp.EventManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.EventManagment.dao.TicketDao;
import edu.jsp.EventManagment.dto.Ticket;


@Service
public class TicketService {
	
	@Autowired
	TicketDao dao;
	
	
	public   Ticket  saveTicket(Ticket ticket) {
		 return dao.saveTicket(ticket);
	}
	
	
	public  List<Ticket>   fetchAllTicketByAge(int age){
		return  dao.fetchAllTicketByAge(age);
	}
	
	
	

}
