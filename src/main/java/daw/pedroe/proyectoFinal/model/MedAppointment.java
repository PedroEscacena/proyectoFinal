package daw.pedroe.proyectoFinal.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medAppointment")
public class MedAppointment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6355547664682243762L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name="date")
	private Date date;

	@Column(name="room")
	private String room;

	@Column(name="note")
	private String note;

	@Column(name="patient_nif")
	private Patient patient;

	@Column(name="nif")
	private Doctor doctor;

	public MedAppointment() {
		super();
	}

	public MedAppointment(long id,Date date, String room,String note, Doctor doctor, Patient patient) {
		super();
		this.id=id;
		this.date = date;
		this.room = room;
		this.note = note;
		this.doctor = doctor;
		this.patient = patient;
	}

	public MedAppointment(Date date, Doctor doctor, Patient patient) {
		super();
		this.date = date;
		this.doctor = doctor;
		this.patient = patient;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
