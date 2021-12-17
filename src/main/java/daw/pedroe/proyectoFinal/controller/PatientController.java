package daw.pedroe.proyectoFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import daw.pedroe.proyectoFinal.service.PatientService;

public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/patient")
	public String patientPage() {
		return "patient";

	}

	@GetMapping("/patient")
	public String listPatients(Model model, String nif) {
		model.addAttribute("listPatient", patientService.findByNifPatient(nif));
		return "patient";
	}

}
