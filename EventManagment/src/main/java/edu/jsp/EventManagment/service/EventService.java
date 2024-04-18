package edu.jsp.EventManagment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.EventManagment.dao.EventDao;
import edu.jsp.EventManagment.dto.Event;

@Service
public class EventService {

	@Autowired
	private EventDao dao;

	public Event saveEvent(Event event) {
		return dao.saveEvent(event);
	}

}
