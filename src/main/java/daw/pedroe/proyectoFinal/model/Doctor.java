package daw.pedroe.proyectoFinal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8281471448617054636L;

	@Id
	private String nif;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="workhours")
	private int workhours;
	
	@Column(name="specialty")
	private String specialty;
	
	@Column(name="medAppointment")
	private MedAppointment medAppointment;
	
	@Column(name="patient")
	private Patient patient;
	
	@Column(name="user_id")
	private User user;
	

	public Doctor() {
		super();
	}

	public Doctor(String name, String nif, String specialty) {
		super();
		this.name = name;
		this.nif = nif;
		this.specialty = specialty;

	}

	public Doctor(String name, String surname, String nif, String specialty, int salary, int workhours,
			MedAppointment medAppointment, Patient patient,User user) {
		super();
		this.name = name;
		this.surname = surname;
		this.nif = nif;
		this.specialty = specialty;
		this.salary = salary;
		this.workhours = workhours;
		this.medAppointment = medAppointment;
		this.patient = patient;
		this.user=user;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getWorkhours() {
		return workhours;
	}

	public void setWorkhours(int workhours) {
		this.workhours = workhours;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public MedAppointment getMedAppointment() {
		return medAppointment;
	}

	public void setMedAppointment(MedAppointment medAppointment) {
		this.medAppointment = medAppointment;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
