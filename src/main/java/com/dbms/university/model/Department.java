package com.dbms.university.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	
	
	public Department() {
		super();
	}

	public String getDCode() {
		return DCode;
	}
	
	public void setDCode(String dCode) {
		DCode = dCode;
	}
	
	public String getDName() {
		return DName;
	}
	
	public void setDName(String dName) {
		DName = dName;
	}
	
	public String getDOffice() {
		return DOffice;
	}
	public void setDOffice(String dOffice) {
		DOffice = dOffice;
	}
	public long getDPhone() {
		return DPhone;
	}
	public void setDPhone(long dPhone) {
		DPhone = dPhone;
	}
	public Date getChairStartDate() {
		return ChairStartDate;
	}
	public void setChairStartDate(Date chairStartDate) {
		ChairStartDate = chairStartDate;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getChairId() {
		return ChairId;
	}
	public void setChairId(String chairId) {
		ChairId = chairId;
	}
	
	
	public Department(String dCode, String dName, String dOffice, long dPhone, Date chairStartDate, String cName,
			String chairId) {
		super();
		DCode = dCode;
		DName = dName;
		DOffice = dOffice;
		DPhone = dPhone;
		ChairStartDate = chairStartDate;
		CName = cName;
		ChairId = chairId;
	}
	
	@Id
	public String DCode;
	public String DName;
	public String DOffice;
	public long DPhone;
	public Date ChairStartDate;
	public String CName;
	public String ChairId;

}
