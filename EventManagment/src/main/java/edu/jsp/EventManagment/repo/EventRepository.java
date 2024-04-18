package edu.jsp.EventManagment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.EventManagment.dto.Event;

public interface EventRepository   extends  JpaRepository<Event, Long> {
	

}
