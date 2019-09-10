
package com.michael.model;

//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Medicines")
public class Medicine {
	@Id 
	private int medStoreid;
	private String medicineName;
	
	
//	@ManyToMany(fetch= FetchType.LAZY,
//			cascade = {
//					CascadeType.PERSIST,
//					CascadeType.MERGE
//			})
//	@JoinTable(name="common_id",
//			joinColumns = { @JoinColumn(name="medStoreid")},
//			inverseJoinColumns = {@JoinColumn(name="medStoreid")})
//	
//	private Set<MedUser> commonMeds= new HashSet<>();
//	
//	
	
	public Medicine(){}
	
	public int getMedStoreid() {
		return medStoreid;
	}
	public void setMedStoreid(int medStoreid) {
		this.medStoreid = medStoreid;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setStoreName(String name) {
		this.medicineName = name;
	}
}
