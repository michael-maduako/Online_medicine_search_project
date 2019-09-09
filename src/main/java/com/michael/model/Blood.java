
package com.michael.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BloodInfo")
public class Blood {
	@Id @Column(name="bloodType")
	private String bloodType;
	@Column(name="bloodEmp")
	private String bloodEmp;
	
	
	public Blood(){}


	public String getBloodType() {
		return bloodType;
	}


	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}


	public String getBloodEmp() {
		return bloodEmp;
	}


	public void setBloodEmp(String bloodEmp) {
		this.bloodEmp = bloodEmp;
	}
	
	
}
