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

import daw.pedroe.proyectoFinal.model.Patient;
import daw.pedroe.proyectoFinal.service.PatientService;

public class PatientController {

	@Autowired
	private PatientService patientServicio;
	
	private String base_url = "/patients";
	private String responseTile = "template/html_response";
	
	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView result;

		result = new ModelAndView("template/id_descripcion_table_form");

		Collection<Patient> patients = patientServicio.findAllPatient();

		result.addObject("dataList", patients);
		result.addObject("entity", "patient");
		result.addObject("base_url", this.base_url);
		result.addObject("found_num", patients.size());

		return result;
	}
//	
//	@RequestMapping(value = "/create", method = RequestMethod.GET)
//	public ModelAndView create() {
//
//		ModelAndView result;
//		Patient patient = new Patient();
//		result = this.detailsView(patient);
//		result.addObject("newItem", true);
//		return result;
//	}
	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@Validated Patient patient, BindingResult binding) {

		ModelAndView result = new ModelAndView(this.responseTile);
		try {

			patientServicio.update(patient);

			result.addObject("success");
			result.addObject("OKSAVED");
		} catch (Throwable oops) {
			result.addObject("error");
			result.addObject("NOOKSAVED");
		}
		return result;
	}

	@RequestMapping(value = "/delete")
	public ModelAndView delete(@RequestParam("patient") String patientId) {

		ModelAndView result = new ModelAndView(this.responseTile);
		try {

			Patient patient = patientServicio.findByKey(patientId);
			patientServicio.delete(patient);

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

