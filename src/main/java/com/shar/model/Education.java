package com.shar.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "education")
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "edid")
    private long edid;
	
	@Column(name = "type")
    private String type;
	
	@Column(name = "ed_startdate")
	@Type(type = "date")
    private Date startdate;
	
	@Column(name = "ed_enddate")
	@Type(type = "date")
    private Date enddate;
	
	@Column(name = "institute")
    private String institute;
	
	@Column(name = "address")
    private String address;
	
	@Column(name = "percentage")
    private double percentage;
	
	@ManyToOne
	@JoinColumn(name="edid", referencedColumnName = "eid", insertable = false, updatable = false, nullable = false)
	private Employee employee;

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEdid() {
		return edid;
	}

	public void setEdid(long edid) {
		this.edid = edid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
