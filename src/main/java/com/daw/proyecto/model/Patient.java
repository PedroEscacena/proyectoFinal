package com.daw.proyecto.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8782136989651257369L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int dealer_nif;

    @Column
    private String name;
    
    @Column
    private String address;
	
}
