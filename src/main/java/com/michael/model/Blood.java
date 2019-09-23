
package com.michael.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BloodInfo")
public class Blood {
	@Id @GeneratedValue
	private long id;
	private String bloodType;
	private String bloodEmp;
	private boolean donor;
	
	public Blood(){}

	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



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


	public boolean isDonor() {
		return donor;
	}


	public void setDonor(boolean donor) {
		this.donor = donor;
	}
	
	
}
