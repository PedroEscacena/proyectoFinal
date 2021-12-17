package daw.pedroe.proyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import daw.pedroe.proyectoFinal.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String>{

}
