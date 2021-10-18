package com.daw.proyecto.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	private int id;

	@Column
	private Calendar date;

	@Column
	private String room;

	@Column
	private String result;

	@Column
	private String note;

	@OneToOne
	private Set<Patient> patient;

	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Doctor> doctor;

	public MedAppointment() {
		super();
		this.doctor = new HashSet<Doctor>();
	}

	public MedAppointment(Calendar date, String room, String result, String note, Set<Doctor> doctor,
			Set<Patient> patient) {
		super();
		this.date = date;
		this.room = room;
		this.result = result;
		this.note = note;
		this.doctor = doctor;
		this.patient = patient;
	}

	public MedAppointment(Calendar date, Set<Doctor> doctor, Set<Patient> patient) {
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

	public Set<Patient> getPatient() {
		return patient;
	}

	public void setPatient(Set<Patient> patient) {
		this.patient = patient;
	}

	public Set<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(Set<Doctor> doctor) {
		this.doctor = doctor;
	}
	
	

}
