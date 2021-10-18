package com.daw.proyecto.service;

import java.util.List;
import com.daw.proyecto.model.MedAppointment;
import com.daw.proyecto.repository.MedAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedAppointmentService {

	@Autowired
	private MedAppointmentRepository medappointRepository;

	public List<MedAppointment> findAll() {
		return medappointRepository.findAll();
	}

	public void save(MedAppointment medAppointment) {
		medappointRepository.save(medAppointment);

	}
}
