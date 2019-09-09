
package com.michael.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MedEmp")
public class MedUser {
	@Id @Column(name="medName")
	private String medName;
	@Column(name="storeid")
	private int medStoreid;
	
	
	public MedUser(){}


	public String getMedName() {
		return medName;
	}


	public void setMedName(String medName) {
		this.medName = medName;
	}


	public int getStoreid() {
		return medStoreid;
	}


	public void setStoreid(int storeid) {
		this.medStoreid = storeid;
	}


	
}
