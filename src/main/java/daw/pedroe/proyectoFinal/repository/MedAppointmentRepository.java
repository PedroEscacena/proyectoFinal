package daw.pedroe.proyectoFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import daw.pedroe.proyectoFinal.model.MedAppointment;

@Repository
public interface MedAppointmentRepository extends JpaRepository<MedAppointment, String>{

}
