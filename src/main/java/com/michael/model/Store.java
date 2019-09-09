
package com.michael.model;



import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Store_list")
public class Store {
	@Id 
	private int medStoreid;
	private String storeName;
	private String streetNum;
	private String streetName;
	private String city;
	private String state;
	private String zip;
	
	
	public Store(){}
	
	public int getMedStoreid() {
		return medStoreid;
	}
	public void setMedStoreid(int medStoreid) {
		this.medStoreid = medStoreid;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String name) {
		this.storeName = name;
	}
	public String getStreetNum() {
		return streetNum;
	}
	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
}
