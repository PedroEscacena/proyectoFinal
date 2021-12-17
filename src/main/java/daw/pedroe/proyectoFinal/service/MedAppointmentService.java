package daw.pedroe.proyectoFinal.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import daw.pedroe.proyectoFinal.model.MedAppointment;

@Service
public interface MedAppointmentService{
	
	public List<MedAppointment> findAllMedAppointment();
	Optional <MedAppointment> findByIdMedAppointment(long id);
	void deleteMedAppointmentById(long id);
	void saveMedAppointment(MedAppointment medAppointment);

}
