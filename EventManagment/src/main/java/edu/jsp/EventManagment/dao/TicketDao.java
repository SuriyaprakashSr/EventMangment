package edu.jsp.EventManagment.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.EventManagment.dto.Ticket;
import edu.jsp.EventManagment.repo.TicketRepo;

@Repository
public class TicketDao {

	@Autowired
	TicketRepo repo;

	public Ticket saveTicket(Ticket ticket) {
		return repo.save(ticket);
	}

	public Ticket getById(long id) {

		Optional<Ticket> o = repo.findById(id);
		if (o.isPresent()) {
			return o.get();
		} else {
			return null;
		}

	}

	public List<Ticket> getAll() {

		return repo.findAll();

	}

	public String deleteById(long id) {

		repo.deleteById(id);

		return " data   Delete";

	}

	public List<Ticket> fetchAllTicketByAge(int age) {

		List<Ticket> allTicket = repo.findAll();

		ArrayList<Ticket> al = new ArrayList<>();

		for (Ticket t : allTicket) {

			if (t.getPerson().getAge() >= age) {

				al.add(t);

			}

		}
		return al;

	}

}
