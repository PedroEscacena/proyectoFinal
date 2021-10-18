package com.daw.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.daw.proyecto.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
