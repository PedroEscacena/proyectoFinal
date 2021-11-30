package daw.pedroe.proyectoFinal.dao;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import daw.pedroe.proyectoFinal.model.Report;

@Component
public class ReportDAO {

	private static final Logger log = Logger.getLogger(ReportDAO.class);

	@Autowired
	private SessionFactory sessionFactory;

	public void delete(Report persistentInstance) {
		log.debug("deleting Report instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public void persist(Report transientInstance) {
		log.debug("persisting Report instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Report instance) {
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
	public Collection<Report> findAll() {
		log.debug("findingAll Report");
		try {
			List<Report> results = sessionFactory.getCurrentSession().createCriteria(Report.class).list();
			log.debug("findAll, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("findAll failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Report> findByIdReport(List<String> reports) {
		log.debug("finding findColectivosByDivision");
		try {
			Criteria criterios = sessionFactory.getCurrentSession().createCriteria(Report.class);

			criterios.addOrder(Order.asc("id"));

			List<Report> results = criterios.list();

			log.debug("finding findColectivosByDivision successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("finding findColectivosByDivision failed", re);
			throw re;
		}
	}

}
