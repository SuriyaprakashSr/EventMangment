package edu.jsp.EventManagment.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.EventManagment.dto.Event;
import edu.jsp.EventManagment.repo.EventRepository;

@Repository
public class EventDao {

	@Autowired
	EventRepository repository;

	public Event saveEvent(Event event) {

		return repository.save(event);
	}

}
