package daw.pedroe.proyectoFinal.serviceImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import daw.pedroe.proyectoFinal.dao.DoctorDAO;

import daw.pedroe.proyectoFinal.model.Doctor;
import daw.pedroe.proyectoFinal.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {

	private static final Logger log = Logger.getLogger(DoctorServiceImpl.class);

	@Autowired
	private DoctorDAO doctorDao;

	@Override
	public String create(Doctor newEntity) {
		log.debug("Metodo: create.");
		doctorDao.persist(newEntity);
		return newEntity.getNif();
	}

	@Override
	public void delete(Doctor entity) {
		// TODO Auto-generated method stub
		log.debug("Metodo: delete");
		doctorDao.delete(entity);
	}

	@Override
	public void update(Doctor entity) {
		// TODO Auto-generated method stub

		log.debug("Metodo: update");
		doctorDao.attachDirty(entity);
	}

	

	@Override
	public java.util.List<Doctor> findAllDoctor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.util.List<Doctor> findByNifDoctor(java.util.List<String> doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor findByKey(String doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

}
