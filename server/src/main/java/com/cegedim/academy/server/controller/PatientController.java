package com.cegedim.academy.server.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cegedim.academy.server.dto.PatientDto;
import com.cegedim.academy.server.entitiy.Patient;
import com.cegedim.academy.server.service.PatientServiceImpl;

@CrossOrigin
@RequestMapping("/api/patients")
@RestController
public class PatientController {
	
	@Autowired
	private PatientServiceImpl patientService;

	@GetMapping("/{id}")
	public PatientDto getPatient(@PathVariable(name = "id") Integer id) {
		return patientService.getPatient(id);
	}
	
	@PostMapping("/create")
	public void addPatient(@RequestBody PatientDto d)
	{
		patientService.addPatient(d);
		
	}
	
	@PutMapping("/update/{id}")
	public void updatePatient(@RequestBody PatientDto d,@PathVariable(name="id") Integer id)
	{
		patientService.updatePatient(d,id);
	}
	
	

}
