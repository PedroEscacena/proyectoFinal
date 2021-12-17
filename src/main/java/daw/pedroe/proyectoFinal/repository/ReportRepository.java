package daw.pedroe.proyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import daw.pedroe.proyectoFinal.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, String>{

}
