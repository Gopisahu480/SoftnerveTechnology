package com.Project.Assesments;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Patient_Details")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //INCREAMENT
	private int PatientId;
	@Column
	private String name;
	@Column
	private String PatientContactNumber;
	public String getPatientContactNumber() {
		return PatientContactNumber;
	}
	public void setPatientContactNumber(String patientContactNumber) {
		PatientContactNumber = patientContactNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPatientId() {
		return PatientId;
	}
	public void setPatientId(int patientId) {
		PatientId = patientId;
	}
	

}
