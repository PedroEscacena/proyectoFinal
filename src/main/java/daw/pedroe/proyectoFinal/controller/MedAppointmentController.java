package daw.pedroe.proyectoFinal.controller;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import daw.pedroe.proyectoFinal.model.MedAppointment;
import daw.pedroe.proyectoFinal.service.MedAppointmentService;

public class MedAppointmentController {

	
	@Autowired
	private MedAppointmentService medAppointmentServicio;
	
	private String base_url = "/medAppointments";
	private String responseTile = "template/html_response";
	
	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView result;

		result = new ModelAndView("template/id_descripcion_table_form");

		Collection<MedAppointment> medAppointments = medAppointmentServicio.findAll();

		result.addObject("dataList", medAppointments);
		result.addObject("entity", "medAppointment");
		result.addObject("base_url", this.base_url);
		result.addObject("found_num", medAppointments.size());

		return result;
	}
////	
//	@RequestMapping(value = "/create", method = RequestMethod.GET)
//	public ModelAndView create() {
//
//		ModelAndView result;
//		MedAppointment medAppointment = new MedAppointment();
//		result = this.detailsView(medAppointment);
//		result.addObject("newItem", true);
//		return result;
//	}
//	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@Validated MedAppointment medAppointment, BindingResult binding) {

		ModelAndView result = new ModelAndView(this.responseTile);
		try {

			medAppointmentServicio.update(medAppointment);

			result.addObject("success");
			result.addObject("OKSAVED");
		} catch (Throwable oops) {
			result.addObject("error");
			result.addObject("NOOKSAVED");
		}
		return result;
	}

	@RequestMapping(value = "/delete")
	public ModelAndView delete(@RequestParam("medAppointment") Long medAppointmentId) {

		ModelAndView result = new ModelAndView(this.responseTile);
		try {

			MedAppointment medAppointment = (MedAppointment) medAppointmentServicio.findByIdMedApp(Long.toString(medAppointmentId) );
			medAppointmentServicio.delete(medAppointment);

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
