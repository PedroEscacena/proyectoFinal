package daw.pedroe.proyectoFinal.dao;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import daw.pedroe.proyectoFinal.model.MedAppointment;

@Component
public class MedAppointmentDAO {

	private static final Logger log = Logger.getLogger(MedAppointmentDAO.class);

	@Autowired
	private SessionFactory sessionFactory;

	public void delete(MedAppointment persistentInstance) {
		log.debug("deleting MedAppointment instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public void persist(MedAppointment transientInstance) {
		log.debug("persisting MedAppointment instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MedAppointment instance) {
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
	public Collection<MedAppointment> findAll() {
		log.debug("findingAll MedAppointment");
		try {
			List<MedAppointment> results = sessionFactory.getCurrentSession().createCriteria(MedAppointment.class)
					.list();
			log.debug("findAll, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("findAll failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<MedAppointment> findByIdMedAppointment(List<String> medAppointments) {
		log.debug("finding findColectivosByDivision");
		try {
			Criteria criterios = sessionFactory.getCurrentSession().createCriteria(MedAppointment.class);


			criterios.addOrder(Order.asc("id"));

			List<MedAppointment> results = criterios.list();

			log.debug("finding findColectivosByDivision successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("finding findColectivosByDivision failed", re);
			throw re;
		}
	}

}
