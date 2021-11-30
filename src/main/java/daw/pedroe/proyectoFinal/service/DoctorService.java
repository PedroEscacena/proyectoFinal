package daw.pedroe.proyectoFinal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import daw.pedroe.proyectoFinal.model.Doctor;

@Service
public interface DoctorService {

	public String create(Doctor newEntity);

	public void delete(Doctor entity);

	public void update(Doctor entity);

	public List<Doctor> findAllDoctor();

	public List<Doctor> findByNifDoctor(List<String> doctor);

	public Doctor findByKey(String doctorId);
}
