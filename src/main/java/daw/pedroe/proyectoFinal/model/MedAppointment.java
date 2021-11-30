package daw.pedroe.proyectoFinal.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MEDAPPOINTMENT")
public class MedAppointment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6355547664682243762L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private Calendar date;

	@Column
	private String room;

	@Column
	private String result;

	@Column
	private String note;

	@Column
	private Patient patient;

	@Column
	private List<Doctor> doctor;

	public MedAppointment() {
		super();
	}

	public MedAppointment(Calendar date, String room, String result, String note, List<Doctor> doctor, Patient patient) {
		super();
		this.date = date;
		this.room = room;
		this.result = result;
		this.note = note;
		this.doctor = doctor;
		this.patient = patient;
	}

	public MedAppointment(Calendar date, List<Doctor> doctor, Patient patient) {
		super();
		this.date = date;
		this.doctor = doctor;
		this.patient = patient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

}
