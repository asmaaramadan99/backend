package com.cegedim.academy.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cegedim.academy.server.entitiy.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
