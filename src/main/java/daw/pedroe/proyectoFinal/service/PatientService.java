package daw.pedroe.proyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import daw.pedroe.proyectoFinal.model.Patient;

@Service
public interface PatientService {

	
	public List<Patient> findAllPatient();
	Optional<Patient> findByNifPatient(String nif);

}
