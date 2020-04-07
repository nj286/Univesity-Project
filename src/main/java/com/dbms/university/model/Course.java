package com.dbms.university.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Course")
public class Course {
	public String getCCode() {
		return CCode;
	}


	public void setCCode(String cCode) {
		CCode = cCode;
	}


	public String getCoName() {
		return CoName;
	}


	public void setCoName(String coName) {
		CoName = coName;
	}


	public int getCredits() {
		return Credits;
	}


	public void setCredits(int credits) {
		Credits = credits;
	}


	public int getLevel() {
		return Level;
	}


	public void setLevel(int level) {
		Level = level;
	}


	public String getCdesc() {
		return Cdesc;
	}


	public void setCdesc(String cdesc) {
		Cdesc = cdesc;
	}


	public String getDCode() {
		return DCode;
	}


	public void setDCode(String dCode) {
		DCode = dCode;
	}


	public Course(String cCode, String coName, int credits, int level, String cdesc, String dCode) {
		super();
		CCode = cCode;
		CoName = coName;
		Credits = credits;
		Level = level;
		Cdesc = cdesc;
		DCode = dCode;
	}

	@Id
	public String CCode;
	public String CoName;
	public int Credits;
	public int Level;
	public String Cdesc;
	public String DCode;
	

	// Needed by Caused by: com.fasterxml.jackson.databind.JsonMappingException:
	// Can not construct instance of com.in28minutes.springboot.model.Course:
	// no suitable constructor found, can not deserialize from Object value
	// (missing default constructor or creator, or perhaps need to add/enable
	// type information?)
	public Course() {

	}

	

}