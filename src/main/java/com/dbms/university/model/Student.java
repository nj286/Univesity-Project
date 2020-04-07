package com.dbms.university.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	
	public Student() {
		super();
	}
	public String getStudentID() {
		return SId;
	}
	public void setStudentID(String studentID) {
		SId = studentID;
	}
	public Date getDate() {
		return DOB;
	}
	public void setDate(Date date) {
		this.DOB = date;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getMname() {
		return Mname;
	}
	public Student(String studentID, Date date, String fname, String mname, String lname, String address, long phone,
			String major, String dCode) {
		super();
		SId = studentID;
		this.DOB = date;
		Fname = fname;
		Mname = mname;
		Lname = lname;
		Addr = address;
		Phone = phone;
		Major = major;
		DCode = dCode;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getAddress() {
		return Addr;
	}
	public void setAddress(String address) {
		Addr = address;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	public String getDCode() {
		return DCode;
	}
	public void setDCode(String dCode) {
		DCode = dCode;
	}
	@Id
	public String SId;
	public Date DOB;
	public String Fname;
	public String Mname;
	public String Lname;
	public String Addr;
	public long Phone;
	public String  Major;
	public String DCode;
	
	
}