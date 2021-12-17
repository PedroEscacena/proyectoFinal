package daw.pedroe.proyectoFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import daw.pedroe.proyectoFinal.model.MedAppointment;
import daw.pedroe.proyectoFinal.service.MedAppointmentService;

public class MedAppointmentController {

	@Autowired
	private MedAppointmentService medAppointmentServicio;
	
	@GetMapping("/medAppointment")
	public String pmedAppointmentPage() {
		return "medAppointment";
		
	}
	
	
	@GetMapping("/medAppointment")
	public String listMedAppointment(Model model) {
		model.addAttribute("listMedAppointments", medAppointmentServicio.findAllMedAppointment());
		return "medAppointment";

	}
	
	@GetMapping("/saveMedAppointment")
	public String save(@ModelAttribute("medAppointment") MedAppointment medAppointment, Model model) {
		medAppointmentServicio.saveMedAppointment(medAppointment);
		model.addAttribute("customers", medAppointmentServicio.findAllMedAppointment());
		return "redirect:/medAppointment";
	}
	
	@GetMapping("/deleteMedAppointment/{id}")
	public String deleteReport(@PathVariable Long id) {
		medAppointmentServicio.deleteMedAppointmentById(id);
		return "redirect:/medAppointment";
	}
	
	
	
}
