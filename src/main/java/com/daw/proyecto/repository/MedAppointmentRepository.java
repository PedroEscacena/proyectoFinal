package com.daw.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.daw.proyecto.model.MedAppointment;

public interface MedAppointmentRepository extends JpaRepository<MedAppointment, Integer> {

}
