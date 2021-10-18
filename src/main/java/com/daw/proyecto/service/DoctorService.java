package com.daw.proyecto.service;

import java.util.List;
import com.daw.proyecto.model.Doctor;
import com.daw.proyecto.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
	@Autowired
	private Doctor doctorRepository;

	public List<Doctor> findAll() {
		return doctorRepository.findAll();
	}

	public void save(Doctor doctor) {
		doctorRepository.save(doctor);

	}
}
