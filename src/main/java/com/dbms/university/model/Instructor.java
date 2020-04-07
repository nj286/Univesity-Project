package com.dbms.university.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Instructor")
public class Instructor {
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getIName() {
		return IName;
	}
	public void setIName(String iName) {
		IName = iName;
	}
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
	}
	public String getIOffice() {
		return IOffice;
	}
	public void setIOffice(String iOffice) {
		IOffice = iOffice;
	}
	public long getIPhone() {
		return IPhone;
	}
	public void setIPhone(long iPhone) {
		IPhone = iPhone;
	}
	public String getDCode() {
		return DCode;
	}
	public void setDCode(String dCode) {
		DCode = dCode;
	}
	public Instructor() {
		super();
	}
	
	@Id
	public String Id;
	public String IName;
	public int Rank;
	public String IOffice;
	public long IPhone;
	public String DCode;
	public Instructor(String id, String iName, int rank, String iOffice, long iPhone, String dCode) {
		super();
		Id = id;
		IName = iName;
		Rank = rank;
		IOffice = iOffice;
		IPhone = iPhone;
		DCode = dCode;
	}

}
