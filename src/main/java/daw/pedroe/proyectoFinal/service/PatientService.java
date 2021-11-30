package daw.pedroe.proyectoFinal.service;
import java.util.List;

import org.springframework.stereotype.Service;

import daw.pedroe.proyectoFinal.model.Patient;

@Service
public interface PatientService {

	public String create(Patient newEntity);

	public void delete(Patient entity);

	public void update(Patient entity);

	public List<Patient> findAllPatient();

	public List<Patient> findByNifPatient(List<String> patient);

	public Patient findByKey(String patientId);

}
