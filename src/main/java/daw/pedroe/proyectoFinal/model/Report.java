package daw.pedroe.proyectoFinal.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "REPORT")
public class Report {

	@Id
	private String id;
	@Column
	private String comment;
	@Column
	private String rep;
	@Column
	private String medicine;
	@Column
	private String result;
	@Column
	private Calendar date;
	@Column
	private MedAppointment medApp;
	@Column
	private Patient patient;
	@Column
	private Doctor doctor;


	public Report() {
		super();
	}

	public Report(String id, String result, String medicine, String rep, MedAppointment medApp, Patient patient, Doctor doctor) {
		super();
		this.id = id;
		this.result = result;
		this.medicine = medicine;
		this.rep = rep;
		this.medApp = medApp;
		this.patient=patient;
		this.doctor=doctor;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public MedAppointment getMedApp() {
		return medApp;
	}

	public void setMedApp(MedAppointment medApp) {
		this.medApp = medApp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	

}
