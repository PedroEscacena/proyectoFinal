package com.daw.proyecto.Rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daw.proyecto.model.Doctor;
import com.daw.proyecto.model.MedAppointment;
import com.daw.proyecto.service.DoctorService;
import com.daw.proyecto.service.MedAppointmentService;

@RestController
@RequestMapping(path = "/apirest")
@CrossOrigin(origins = "http://localhost")

public class Rest {

	@Autowired
	private MedAppointmentService medAppointmentService;

	@GetMapping("/medAppointment-list")
	public List<Doctor> doctorList(Model model) {
		List<Doctor> list = DoctorService.findAll();
		for (Doctor doctor : list) {
			for (MedAppointment medAppointment : doctor.getmedAppointments()) {
//				doctor.setDrivers(null);
//				doctor.setGarages(null);
			}
		}

		return list;
	}
}
