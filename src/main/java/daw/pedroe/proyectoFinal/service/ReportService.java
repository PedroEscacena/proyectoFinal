package daw.pedroe.proyectoFinal.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import daw.pedroe.proyectoFinal.model.Report;

@Service
public interface ReportService{
	
	void saveReport(Report report);
	public List<Report> findAllReport();
	Optional <Report> findByIdReport(String reportId);
	void deleteReportById(String id);

}
