package edu.jsp.EventManagment.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String discription;

	@OneToOne(cascade = CascadeType.ALL)
	private EventDetails details;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
	@JsonIgnoreProperties("event")
	private List<Ticket> tickets;

}
