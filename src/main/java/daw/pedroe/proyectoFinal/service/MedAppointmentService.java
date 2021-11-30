package daw.pedroe.proyectoFinal.service;
import java.util.List;

import org.springframework.stereotype.Service;

import daw.pedroe.proyectoFinal.model.MedAppointment;

@Service
public interface MedAppointmentService {
	public String create(MedAppointment newEntity);

	public void delete(MedAppointment entity);

	public void update(MedAppointment entity);

	public List<MedAppointment> findAll();

	public List<MedAppointment> findByIdMedApp(String string);
}
