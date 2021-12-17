package daw.pedroe.proyectoFinal.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import daw.pedroe.proyectoFinal.model.Report;
import daw.pedroe.proyectoFinal.service.ReportService;

@Controller
@RequestMapping("/reports")
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class ReportController {
	
	@Autowired
	private ReportService reportService;

	@GetMapping("/report")
	public String reportPage() {
		return "report";

	}
	
	// handler method to handle list report and return mode and view
	@GetMapping("/report")
	public String listReports(Model model) {
		model.addAttribute("listReports", reportService.findAllReport());
		return "report";
	}
	
	@GetMapping("/report/new")
	public String createReportForm(Model model) {
		
		// create report object to hold report form data
		Report report = new Report();
		model.addAttribute("report", report);
		return "create_report";
		
	}
	
	@PostMapping("/report")
	
	public String saveReport(@ModelAttribute("report") Report report) {
		reportService.saveReport(report);
		return "redirect:/report";
	}
	
	@GetMapping("/deleteReport/{id}")
	public String deleteReport(@PathVariable Long id) {
		reportService.deleteReportById(String.valueOf(id));
		return "redirect:/report";
	}
	
	
	

	

}
