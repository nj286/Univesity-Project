package com.dbms.university.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Section")
public class Section {
	
	public Section() {
		super();
	}
	public Section(String secId, int secNo, int sem, int year, int roomNo, String bldg, int daysTime, String cCode,
			String instructorId) {
		super();
		SecId = secId;
		SecNo = secNo;
		Sem = sem;
		this.year = year;
		RoomNo = roomNo;
		Bldg = bldg;
		DaysTime = daysTime;
		CCode = cCode;
		InstructorId = instructorId;
	}
	@Id
	public String SecId;
	public String getSecId() {
		return SecId;
	}
	public void setSecId(String secId) {
		SecId = secId;
	}
	public int getSecNo() {
		return SecNo;
	}
	public void setSecNo(int secNo) {
		SecNo = secNo;
	}
	public int getSem() {
		return Sem;
	}
	public void setSem(int sem) {
		Sem = sem;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}
	public String getBldg() {
		return Bldg;
	}
	public void setBldg(String bldg) {
		Bldg = bldg;
	}
	public int getDaysTime() {
		return DaysTime;
	}
	public void setDaysTime(int daysTime) {
		DaysTime = daysTime;
	}
	public String getCCode() {
		return CCode;
	}
	public void setCCode(String cCode) {
		CCode = cCode;
	}
	public String getInstructorId() {
		return InstructorId;
	}
	public void setInstructorId(String instructorId) {
		InstructorId = instructorId;
	}
	public int SecNo;
	public int Sem;
	public int year;
	public int RoomNo;
	public String Bldg;
	public int DaysTime;
	public String CCode;
	public String InstructorId;
	
	
	
	

}
