package com.daw.proyecto.model;





import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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

	@Column
	private Patient patient[];
	@Column
	private MedAppointment medappointment[];
}
