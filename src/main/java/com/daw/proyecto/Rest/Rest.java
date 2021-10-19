package com.daw.proyecto.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daw.proyecto.model.Doctor;
import com.daw.proyecto.service.DoctorService;

@RestController
@RequestMapping(path = "/apirest")
@CrossOrigin(origins = "http://localhost")

public class Rest {

//	@Autowired
//	private MedAppointmentService medAppointmentService;
	@Autowired
	private DoctorService doctorService;

	@GetMapping("/doctor-list")
	public List<Doctor> doctorList(Model model) {
		List<Doctor> list = doctorService.findAll();

		for (Doctor doctor : list) {
			doctor.setMedappointment(null);
			doctor.setPatient(null);
		}

		return list;

	}
}
