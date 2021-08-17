package com.cegedim.academy.server.mappers;

import org.springframework.stereotype.Component;

import com.cegedim.academy.server.dto.PatientDto;
import com.cegedim.academy.server.entitiy.Patient;

@Component
public class PatientMapper {
	
	public PatientDto toDto(Patient p) {
		PatientDto d = new PatientDto();
		
		d.setFirstName(p.getFirstName());
		d.setGender(p.getGender());
		d.setId(p.getId());
		d.setLastName(p.getLastName());
		
		return d;
	}
	
	public Patient fromDto(PatientDto d) {
		Patient p = new Patient();
		
		p.setFirstName(d.getFirstName());
		p.setGender(d.getGender());
		p.setId(d.getId());
		p.setLastName(d.getLastName());
		
		return p;
	}
	

}
