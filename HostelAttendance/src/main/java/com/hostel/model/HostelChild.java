package com.hostel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class HostelChild {
	@Id
	private int rollno;
	private int age;
	private String city;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "HostelChild [rollno=" + rollno + ", age=" + age + ", city=" + city + "]";
	}
	
	

}
