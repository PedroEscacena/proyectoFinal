package com.daw.proyecto.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private int salary;
	@Column
	private int workhours;
	@Column
	private String specialty;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@Column
	private Set<Patient> patient;
	@Column
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<MedAppointment> medappointment;

	public Doctor() {
		super();
		this.patient = new HashSet<Patient>();
		this.medappointment = new HashSet<MedAppointment>();

	}

	public Doctor(String name, String nif, String specialty) {
		super();
		this.name = name;
		this.nif = nif;
		this.specialty = specialty;

	}

	public Doctor(String name, String nif, String specialty, int salary, int workhours, Set<Patient> patient,
			Set<MedAppointment> medAppointment) {
		super();
		this.name = name;
		this.nif = nif;
		this.specialty = specialty;
		this.salary = salary;
		this.workhours = workhours;
		this.patient = patient;
		this.medappointment = medAppointment;
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

	public Set<Patient> getPatient() {
		return patient;
	}

	public void setPatient(Set<Patient> patient) {
		this.patient = patient;
	}

	public Set<MedAppointment> getMedappointment() {
		return medappointment;
	}

	public void setMedappointment(Set<MedAppointment> medappointment) {
		this.medappointment = medappointment;
	}

}
