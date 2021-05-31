package com.shar.model;


import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name="employee")
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="fname")
    private String Fname;
	
	@Column(name="lname")
    private String lname;
	
	@Column(name="eid")
    private long Eid;
	
	@Column(name="startdate")
	@Type(type="date")
    private Date startdate;
	
	@Column(name="designation")
    private String Designation;
	
	@Column(name="department")
    private String Department;
	
	@Column(name="enddate")
	@Type(type="date")
    private Date enddate;
	
	@Column(name="status")
    private String Status;
	
	@Column(name="dob")
	@Type(type="date")
    private Date dob;
	
	@Column(name="repmgr")
    private String Repmgr;
	
	@Column(name="gender")
    private String Gender;
	
	@Column(name="bloodgrp")
    private String Bloodgrp;
	
	@Column(name="address")
    private String Address;
	
	@OneToMany(mappedBy = "employee")
	private Collection<Dependant> dependant;
	
	@OneToMany(mappedBy = "employee")
	private Collection<Education> education;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getEid() {
		return Eid;
	}
	public void setEid(long eid) {
		Eid = eid;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getRepmgr() {
		return Repmgr;
	}
	public void setRepmgr(String repmgr) {
		Repmgr = repmgr;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBloodgrp() {
		return Bloodgrp;
	}
	public void setBloodgrp(String bloodgrp) {
		Bloodgrp = bloodgrp;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
