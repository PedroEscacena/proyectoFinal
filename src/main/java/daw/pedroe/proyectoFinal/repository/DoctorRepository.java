package daw.pedroe.proyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import daw.pedroe.proyectoFinal.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String>{

}
