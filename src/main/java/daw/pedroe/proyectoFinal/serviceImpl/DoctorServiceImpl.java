package daw.pedroe.proyectoFinal.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import daw.pedroe.proyectoFinal.model.Doctor;
import daw.pedroe.proyectoFinal.repository.DoctorRepository;
import daw.pedroe.proyectoFinal.service.DoctorService;

@Transactional
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;
	@Override
	public List<Doctor> findAllDoctor() {
		return doctorRepository.findAll();
	}

	@Override
	public Optional<Doctor> findByNifDoctor(String nif) {
		// TODO Auto-generated method stub
		Optional<Doctor> optional = doctorRepository.findById(nif);
		Doctor doctor = null;
		if (optional.isPresent()) {
			doctor = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + nif);
		}
		return Optional.of(doctor);
	}



}
