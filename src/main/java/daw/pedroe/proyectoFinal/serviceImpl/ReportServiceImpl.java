package daw.pedroe.proyectoFinal.serviceImpl;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import daw.pedroe.proyectoFinal.dao.ReportDAO;
import daw.pedroe.proyectoFinal.model.Report;
import daw.pedroe.proyectoFinal.service.ReportService;

public class ReportServiceImpl implements ReportService {

	private static final Logger log = Logger.getLogger(ReportServiceImpl.class);

	@Autowired
	private ReportDAO reportDao;

	@Override
	public String create(Report newEntity) {
		log.debug("Metodo: create.");
		reportDao.persist(newEntity);
		return newEntity.getId();
	}

	@Override
	public void delete(Report entity) {
		// TODO Auto-generated method stub

		log.debug("Metodo: delete");
		reportDao.delete(entity);

	}

	@Override
	public void update(Report entity) {
		// TODO Auto-generated method stub

		log.debug("Metodo: update");
		reportDao.attachDirty(entity);

	}

	@Override
	public List<Report> findAllReport() {
		log.debug("Metodo: findAllReport");
		return (List<Report>) reportDao.findAll();
	}


	@Override
	public List<Report> findByIdReport(String reportId) {
		// TODO Auto-generated method stub
		return null;
	}

}
