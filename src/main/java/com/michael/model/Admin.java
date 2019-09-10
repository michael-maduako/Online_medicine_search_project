package com.michael.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Admins")
public class Admin {
	@Id @Column(name="user_id")
	private int medStoreid;
	private String username;
	@JsonIgnore
	private String password;
	@Column(name="medUser")
	private String medUser;
	@Column(name="medPassword")
	private String medPassword;
	private String bloodUser;
	private String bloodPass;
	
	public Admin(){}
	public int getMedStoreid() {
		return medStoreid;
	}
	public void setMedStoreid(int medStoreid) {
		this.medStoreid = medStoreid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMedUser() {
		return medUser;
	}
	public void setMedUser(String medUser) {
		this.medUser = medUser;
	}
	public String getMedPassword() {
		return medPassword;
	}
	public void setMedPassword(String medPassword) {
		this.medPassword = medPassword;
	}
	public String getBloodUser() {
		return bloodUser;
	}
	public void setBloodUser(String bloodUser) {
		this.bloodUser = bloodUser;
	}
	public String getBloodPass() {
		return bloodPass;
	}
	public void setBloodPass(String bloodPass) {
		this.bloodPass = bloodPass;
	}

}
