package com.cegedim.academy.server.dto;

import java.util.Date;

import lombok.Data;

@Data
public class AppointmentDto {

	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private String description;
	
	private Date appointmentDate;
	
	private String appointmentTime;
	
	private Boolean done;
	
	private Boolean canceled;
	
	private Integer patientId;
	
}
