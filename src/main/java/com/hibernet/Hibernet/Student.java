package com.hibernet.Hibernet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person_Details")
public class Student {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private long phno;
	private String countryname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public Student(int id, String name, long phno, String countryname) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.countryname = countryname;
	}
	public Student() {
		super();
	}
	

}
