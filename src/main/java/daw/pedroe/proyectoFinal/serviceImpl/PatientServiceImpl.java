package daw.pedroe.proyectoFinal.serviceImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import daw.pedroe.proyectoFinal.dao.PatientDAO;
import daw.pedroe.proyectoFinal.model.Patient;
import daw.pedroe.proyectoFinal.service.PatientService;

public class PatientServiceImpl implements PatientService {

	private static final Logger log = Logger.getLogger(PatientServiceImpl.class);

	@Autowired
	private PatientDAO patientDao;

	@Override
	public String create(Patient newEntity) {
		log.debug("Metodo: create.");
		patientDao.persist(newEntity);
		return newEntity.getPatient_nif();
	}

	@Override
	public void delete(Patient entity) {
		// TODO Auto-generated method stub

		log.debug("Metodo: delete");
		patientDao.delete(entity);
	}

	@Override
	public void update(Patient entity) {
		// TODO Auto-generated method stub

		log.debug("Metodo: update");
		patientDao.attachDirty(entity);
	}

	@Override
	public List<Patient> findAllPatient() {
		log.debug("Metodo: findAllPatient");
		return (List<Patient>) patientDao.findAll();
	}

	@Override
	public List<Patient> findByNifPatient(List<String> patient) {
		log.debug("Metodo: findByNifPatient");
		return patientDao.findByIdPatient(patient);
	}

	@Override
	public Patient findByKey(String patientId) {
		// TODO Auto-generated method stub
		return null;
	}

}
