package com.hostel.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class HostelParent {
	@Id
	
	private int roll_no;
	private String name;
	private String dept;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private HostelChild details;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public HostelChild getDetails() {
		return details;
	}
	public void setDetails(HostelChild details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "HostelParent [roll_no=" + roll_no + ", name=" + name + ", dept=" + dept + ", details=" + details + "]";
	}
	public static HostelParent savePersons(HostelParent p) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
