package daw.pedroe.proyectoFinal.model;

import java.io.Serializable;
//
//import java.util.HashSet;
//import java.util.Set;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8782136989651257369L;

	@Id
	private String patient_nif;

	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;

	@Column(name="address")
	private String address;

	@Column(name="sex")
	private char sex;

	@Column(name="edad")
	private Long edad;

	@Column(name="job")
	private String job;
	
	@Column(name="doctor_nif")
	private Doctor doctor;
	
	@Column(name="medAppointment_id")
	private MedAppointment medAppointment;
	
	@Column(name="user_id")
	private User user;

	public Patient() {
		super();

	}

	public Patient(String patient_nif, String name, String surname, String address, MedAppointment medAppointment,
			Doctor doctor, Long edad, char sex, String job, User user) {
		this.patient_nif = patient_nif;
		this.address = address;
		this.name = name;
		this.surname = surname;
		this.medAppointment = medAppointment;
		this.doctor = doctor;
		this.edad = edad;
		this.sex = sex;
		this.job = job;
		this.user=user;
		
	}

	public Patient(String name, String surname, String patient_nif) {
		this.name = name;
		this.surname = surname;
		this.patient_nif = patient_nif;

	}

	public String getPatient_nif() {
		return patient_nif;
	}

	public void setPatient_nif(String patient_nif) {
		this.patient_nif = patient_nif;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public MedAppointment getMedAppointment() {
		return medAppointment;
	}

	public void setMedAppointment(MedAppointment medAppointment) {
		this.medAppointment = medAppointment;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
