package com.cegedim.academy.server.entitiy;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private String gender;
	/*@OneToMany(mappedBy = "appointment", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Appointment> appointment;*/
}
