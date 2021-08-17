package com.cegedim.academy.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cegedim.academy.server.dto.PatientDto;
import com.cegedim.academy.server.entitiy.Patient;
import com.cegedim.academy.server.mappers.PatientMapper;
import com.cegedim.academy.server.repository.PatientRepository;

@Service
public class PatientServiceImpl {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private PatientMapper patientMapper;

	public PatientDto getPatient(Integer id) {
		Patient p = patientRepository.findById(id).orElse(null);
		PatientDto pDto = patientMapper.toDto(p);
		return pDto;
	} 
	
	public void addPatient(PatientDto d)
	{
		Patient newPatient = patientMapper.fromDto(d);
		patientRepository.save(newPatient);
		
	}
	
	public void updatePatient(PatientDto d,Integer id)
	{
		patientRepository.deleteById(id);
		Patient updatedPatient = patientMapper.fromDto(d);
		patientRepository.save(updatedPatient);
					
	}
	

}
