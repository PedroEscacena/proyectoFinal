package daw.pedroe.proyectoFinal.serviceImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import daw.pedroe.proyectoFinal.dao.MedAppointmentDAO;
import daw.pedroe.proyectoFinal.model.MedAppointment;
import daw.pedroe.proyectoFinal.service.MedAppointmentService;

public class MedAppointmentServiceImpl implements MedAppointmentService {

	private static final Logger log = Logger.getLogger(MedAppointmentServiceImpl.class);

	@Autowired
	private MedAppointmentDAO medAppointmentDao;

	@Override
	public String create(MedAppointment newEntity) {
		log.debug("Metodo: create.");
		medAppointmentDao.persist(newEntity);
		return Integer.toString(newEntity.getId())	;
	}

	@Override
	public void delete(MedAppointment entity) {
		// TODO Auto-generated method stub

		log.debug("Metodo: delete");
		medAppointmentDao.delete(entity);

	}

	@Override
	public void update(MedAppointment entity) {
		// TODO Auto-generated method stub

		log.debug("Metodo: update");
		medAppointmentDao.attachDirty(entity);
	}

	@Override
	public List<MedAppointment> findAll() {
		log.debug("Metodo: findAllPatient");
		return (List<MedAppointment>) medAppointmentDao.findAll();
	}

	@Override
	public List<MedAppointment> findByIdMedApp(String string) {
		// TODO Auto-generated method stub
		return null;
	}


}
