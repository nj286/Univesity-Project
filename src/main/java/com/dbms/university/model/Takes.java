package com.dbms.university.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Takes")
public class Takes {

	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getSId() {
		return SId;
	}
	public void setSId(String sId) {
		SId = sId;
	}
	public Takes(String grade, String sId, String secId) {
		super();
		Grade = grade;
		SId = sId;
		SecId = secId;
	}
	public Takes() {
		super();
	}
	public String getSecId() {
		return SecId;
	}
	public void setSecId(String secId) {
		SecId = secId;
	}
	
	public String Grade;
	@Id
	public String SId;
	public String SecId;
}
