package daw.pedroe.proyectoFinal.serviceImpl;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import daw.pedroe.proyectoFinal.model.Report;
import daw.pedroe.proyectoFinal.repository.ReportRepository;
import daw.pedroe.proyectoFinal.service.ReportService;
@Transactional
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository reportRepository;

	@Override
	public void saveReport(Report report) {
		// TODO Auto-generated method stub
		reportRepository.save(report);
	}

	@Override
	public List<Report> findAllReport() {
		// TODO Auto-generated method stub
		return reportRepository.findAll();
	}

	@Override
	public Optional<Report> findByIdReport(String reportId) {
		Optional<Report> optional = reportRepository.findById(reportId);
		Report report = null;
		if (optional.isPresent()) {
			report = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + reportId);
		}
		return Optional.of(report);
	}

	@Override
	public void deleteReportById(String id) {
		// TODO Auto-generated method stub
		reportRepository.deleteById(id);
	}
	

	
//	@Override
//	public void create(Report newEntity) {
//		log.debug("metodo: create.");
//		reportRepository.save(newEntity);
//	}

}
