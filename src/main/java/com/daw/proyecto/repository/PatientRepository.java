package com.daw.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.daw.proyecto.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
