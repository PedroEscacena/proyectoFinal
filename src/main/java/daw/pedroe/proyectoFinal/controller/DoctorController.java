package daw.pedroe.proyectoFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import daw.pedroe.proyectoFinal.service.DoctorService;
import daw.pedroe.proyectoFinal.service.MedAppointmentService;
import daw.pedroe.proyectoFinal.service.ReportService;

@Controller
@RequestMapping("/doctors")
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class DoctorController 
{

	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private MedAppointmentService medAppointmentService;

	@GetMapping("/doctor")
	public String doctorPage() {
		return "doctor";
		
	}
	
	@GetMapping("/patient")
	public String patientPage() {
		return "patient";
		
	}
	@GetMapping("/doctor")
	public String listDoctors(Model model, String nif) {
		model.addAttribute("listDoctors", doctorService.findByNifDoctor(nif));
		return "doctor";
	}
	
	@GetMapping("/doctor")
	public String listMedAppointments(Model model) {
		model.addAttribute("listMedAppointments", medAppointmentService.findAllMedAppointment());
		return "doctor";
	}
	
	


}
