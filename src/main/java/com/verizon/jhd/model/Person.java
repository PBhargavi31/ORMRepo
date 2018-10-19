package com.verizon.jhd.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="Persons")

public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pin")
	private int personalIdentificationNumber;
	@Column(name="fnm")
	private String firstName;
	@Column(name="lnm")
	private String  lastName;
	@Transient
	private String fullName;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private boolean isMarried;
	private LocalDate dateOfBirth;
	

	public Person(int personalIdentificationNumber, String firstName, String lastName, String fullName, Gender gender,
			boolean isMarried, LocalDate dateOfBirth) {
		super();
		this.personalIdentificationNumber = personalIdentificationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.gender = gender;
		this.isMarried = isMarried;
		this.dateOfBirth = dateOfBirth;
	}


	public int getPersonalIdentificationNumber() {
		return personalIdentificationNumber;
	}

	public void setPersonalIdentificationNumber(int personalIdentificationNumber) {
		this.personalIdentificationNumber = personalIdentificationNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	
}
