package daw.pedroe.proyectoFinal.controller;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import daw.pedroe.proyectoFinal.model.Report;
import daw.pedroe.proyectoFinal.service.ReportService;

@Controller
@RequestMapping("/reports")
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class ReportController {
	
	@Autowired
	private ReportService reportServicio;
	
	private String base_url = "/reports";
	private String responseTile = "template/html_response";
	
	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView result;

		result = new ModelAndView("template/id_descripcion_table_form");

		Collection<Report> reports = reportServicio.findAllReport();

		result.addObject("dataList", reports);
		result.addObject("entity", "report");
		result.addObject("base_url", this.base_url);
		result.addObject("found_num", reports.size());

		return result;
	}
//	
//	@RequestMapping(value = "/create", method = RequestMethod.GET)
//	public ModelAndView create() {
//
//		ModelAndView result;
//		Report report = new Report();
//		result = this..(report);
//		result.addObject("newItem", true);
//		return result;
//	}
//	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@Valid Report report, BindingResult binding) {

		ModelAndView result = new ModelAndView(this.responseTile);
		try {

			reportServicio.update(report);

			result.addObject("success");
			result.addObject("OKSAVED");
		} catch (Throwable oops) {
			result.addObject("error");
			result.addObject("NOOKSAVED");
		}
		return result;
	}

	@RequestMapping(value = "/delete")
	public ModelAndView delete(@RequestParam("report") String reportId) {

		ModelAndView result = new ModelAndView(this.responseTile);
		try {

			Report report = (Report) reportServicio.findByIdReport(reportId);
			reportServicio.delete(report);

			result.addObject( "success");
			result.addObject( "OKERASED");
		} catch (DataIntegrityViolationException dive) {

			result.addObject( "error");
			result.addObject("NOERASABLE");
		} catch (Throwable oops) {

			result.addObject( "error");
			result.addObject("NOOKERASED");
		}
		return result;
	}
	

}
