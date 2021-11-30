package daw.pedroe.proyectoFinal.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DOCTOR")
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
	@Column
	private List<MedAppointment> medAppointment;
	@Column
	private List<Patient> patient;

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
			List<MedAppointment> medAppointment, List<Patient> patient) {
		super();
		this.name = name;
		this.surname = surname;
		this.nif = nif;
		this.specialty = specialty;
		this.salary = salary;
		this.workhours = workhours;
		this.medAppointment = medAppointment;
		this.patient = patient;
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

	public List<MedAppointment> getMedAppointment() {
		return medAppointment;
	}

	public void setMedAppointment(List<MedAppointment> medAppointment) {
		this.medAppointment = medAppointment;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

}
