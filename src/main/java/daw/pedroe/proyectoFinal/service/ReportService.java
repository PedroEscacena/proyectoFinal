package daw.pedroe.proyectoFinal.service;
import java.util.List;

import org.springframework.stereotype.Service;

import daw.pedroe.proyectoFinal.model.Report;

@Service
public interface ReportService {
	public String create(Report newEntity);

	public void delete(Report entity);

	public void update(Report entity);

	public List<Report> findAllReport();

	public List<Report> findByIdReport(String reportId);

}
