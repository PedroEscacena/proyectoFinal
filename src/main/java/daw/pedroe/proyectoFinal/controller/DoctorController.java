package daw.pedroe.proyectoFinal.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import org.springframework.web.servlet.mvc.AbstractController;

import daw.pedroe.proyectoFinal.model.Doctor;
import daw.pedroe.proyectoFinal.service.DoctorService;

@Controller
@RequestMapping("/doctors")
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class DoctorController extends AbstractController{

	@Autowired
	private DoctorService doctorServicio;
	
	private String base_url = "/doctors";
	private String responseTile = "template/html_response";
	
	@RequestMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView result;

		result = new ModelAndView("template/id_descripcion_table_form");

		Collection<Doctor> doctors = doctorServicio.findAllDoctor();

		result.addObject("dataList", doctors);
		result.addObject("entity", "doctor");
		result.addObject("base_url", this.base_url);
		result.addObject("found_num", doctors.size());

		return result;
	}
//
//	@RequestMapping(value = "/create", method = RequestMethod.GET)
//	public ModelAndView create() {
//
//		ModelAndView result;
//		Doctor doctor = new Doctor();
//		result = this.detailsView(doctor);
//		result.addObject("newItem", true);
//		return result;
//	}
//	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@Valid Doctor doctor, BindingResult binding) {

		ModelAndView result = new ModelAndView(this.responseTile);
		try {

			doctorServicio.update(doctor);

			result.addObject("success");
			result.addObject("OKSAVED");
		} catch (Throwable oops) {
			result.addObject("error");
			result.addObject("NOOKSAVED");
		}
		return result;
	}

	@RequestMapping(value = "/delete")
	public ModelAndView delete(@RequestParam("doctor") String doctorId) {

		ModelAndView result = new ModelAndView(this.responseTile);
		try {

			Doctor doctor = doctorServicio.findByKey(doctorId);
			doctorServicio.delete(doctor);

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
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
