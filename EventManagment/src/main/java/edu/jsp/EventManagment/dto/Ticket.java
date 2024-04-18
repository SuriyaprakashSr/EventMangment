package edu.jsp.EventManagment.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	private double price;

	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	
	@ManyToOne
	@JsonIgnoreProperties("tickets")
	@JoinColumn(name = "event_id")
	private   Event   event;
	
	
	
	
	
	

}
