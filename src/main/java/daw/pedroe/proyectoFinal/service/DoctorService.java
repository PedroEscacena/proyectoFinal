package daw.pedroe.proyectoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import daw.pedroe.proyectoFinal.model.Doctor;

@Service
public interface DoctorService {

	public List<Doctor> findAllDoctor();
	Optional<Doctor> findByNifDoctor(String nif);

}
