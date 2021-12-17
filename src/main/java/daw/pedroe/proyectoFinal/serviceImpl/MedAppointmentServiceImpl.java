package daw.pedroe.proyectoFinal.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import daw.pedroe.proyectoFinal.model.MedAppointment;
import daw.pedroe.proyectoFinal.repository.MedAppointmentRepository;
import daw.pedroe.proyectoFinal.service.MedAppointmentService;

@Transactional
public class MedAppointmentServiceImpl implements MedAppointmentService {

	@Autowired
	private MedAppointmentRepository medAppointmentRepository;

	@Override
	public List<MedAppointment> findAllMedAppointment() {
		// TODO Auto-generated method stub
		return medAppointmentRepository.findAll();
	}

	@Override
	public void saveMedAppointment(MedAppointment medAppointment) {
		// TODO Auto-generated method stub
		medAppointmentRepository.save(medAppointment);
	}

	@Override
	public void deleteMedAppointmentById(long id) {
		// TODO Auto-generated method stub
		medAppointmentRepository.deleteById(String.valueOf(id));
	}

	@Override
	public Optional<MedAppointment> findByIdMedAppointment(long id) {
		Optional<MedAppointment> optional = medAppointmentRepository.findById(String.valueOf(id));
		MedAppointment medAppointment = null;
		if (optional.isPresent()) {
			medAppointment = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return Optional.of(medAppointment);
	}


}
