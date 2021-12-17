package daw.pedroe.proyectoFinal.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AppController {
	
	@GetMapping({ "/", "/login" })
	public String index() {
		return "index";
	}

	@GetMapping("/patient")
	public String patient() {
		return "patient";
	}

	@GetMapping("/doctor")
	public String doctor() {
		return "doctor";
	}
}
