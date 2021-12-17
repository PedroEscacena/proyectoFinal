package daw.pedroe.proyectoFinal.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import daw.pedroe.proyectoFinal.model.Patient;
import daw.pedroe.proyectoFinal.repository.PatientRepository;
import daw.pedroe.proyectoFinal.service.PatientService;
@Transactional
public class PatientServiceImpl implements PatientService {


	@Autowired
	private PatientRepository patientRepository;

	

	@Override
	public List<Patient> findAllPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public Optional<Patient> findByNifPatient(String nif) {
		// TODO Auto-generated method stub
		Optional<Patient> optional = patientRepository.findById(nif);
		Patient patient = null;
		if (optional.isPresent()) {
			patient = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + nif);
		}
		return Optional.of(patient);
	}
	


}
