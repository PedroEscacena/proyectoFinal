package daw.pedroe.proyectoFinal.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "report")
public class Report {

	@Id
	private String id;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="rep")
	private String rep;
	
	@Column(name="medicine")
	private String medicine;
	
	@Column(name="result")
	private String result;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="medApp_id")
	private MedAppointment medApp;
	
	@Column(name="doctor_nif")
	private Doctor doctor;
	
	@Column(name="patient_nif")
	private Patient patient;
	


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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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
