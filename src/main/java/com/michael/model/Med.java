
package com.michael.model;

//import java.util.HashSet;
//import java.util.Set;

//import javax.persistence.Column;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
//import javax.persistence.FetchType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Medicines")
public class Med {
	@Id @GeneratedValue
	private Long id;
	private String storeName;
	private String medicineName;
	private String medicineType;
	private String prescription;


	
	public Med(){}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getStoreName() {
		return storeName;
	}



	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}



	public String getMedicineName() {
		return medicineName;
	}



	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}



	public String getMedicineType() {
		return medicineType;
	}



	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}



	public String getPrescription() {
		return prescription;
	}



	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	
	

	
	
}
