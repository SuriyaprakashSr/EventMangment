package edu.jsp.EventManagment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.EventManagment.dto.Ticket;

public interface TicketRepo   extends  JpaRepository<Ticket, Long>{

}
