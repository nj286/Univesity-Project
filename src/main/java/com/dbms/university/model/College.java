package com.dbms.university.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "College")
public class College {
	public College() {
	
	}
	public College(String cName,  String cOffice,long cPhone, String deanid) {
		super();
		CName = cName;
		COffice = cOffice;
		CPhone = cPhone;
		Deanid = deanid;
	}
	@Id
	String CName;
	String COffice;
	long CPhone;
	String Deanid;
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public long getCPhone() {
		return CPhone;
	}
	public void setCPhone(long cPhone) {
		CPhone = cPhone;
	}
	public String getCOffice() {
		return COffice;
	}
	public void setCOffice(String cOffice) {
		COffice = cOffice;
	}
	public String getDeanid() {
		return Deanid;
	}
	public void setDeanid(String deanid) {
		Deanid = deanid;
	}
	
}
