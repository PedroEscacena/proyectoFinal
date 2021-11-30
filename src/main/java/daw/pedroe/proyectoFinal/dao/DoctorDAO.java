package daw.pedroe.proyectoFinal.dao;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import daw.pedroe.proyectoFinal.model.Doctor;

@Component
public class DoctorDAO {

	private static final Logger log = Logger.getLogger(DoctorDAO.class);

	@Autowired
	private SessionFactory sessionFactory;

	public void delete(Doctor persistentInstance) {
		log.debug("deleting Doctor instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public void persist(Doctor transientInstance) {
		log.debug("persisting Doctor instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Doctor instance) {
		log.debug("attaching dirty  instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public Collection<Doctor> findAll() {
		log.debug("findingAll Doctor");
		try {
			List<Doctor> results = sessionFactory.getCurrentSession().createCriteria(Doctor.class).list();
			log.debug("findAll, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("findAll failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Doctor> findByNifDoctor(List<String> doctors) {
		log.debug("finding findColectivosByDivision");
		try {
			Criteria criterios = sessionFactory.getCurrentSession().createCriteria(Doctor.class);

			if (doctors != null) {
				// criterios.add(DAOUtilities.getCriteriaIn("id", doctors));
			}

			// criterios.addOrder(Order.asc("id"));

			List<Doctor> results = criterios.list();

			log.debug("finding findColectivosByDivision successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("finding findColectivosByDivision failed", re);
			throw re;
		}
	}

}
