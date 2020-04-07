package com.dbms.university;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Constant {
	
	/*
	 * CName = cName;
		COffice = cOffice;
		CPhone = cPhone;
		Deanid = deanid;
	 */
	public static final String Table_Name_1 = "College";
	public static final String College_col1 = "College Name";
	public static final String College_col2 = "Office Address";
	public static final String College_col3 = "Contact Number";
	public static final String College_col4 = "Dean ID";
	
	public static List<String> getCollegeColumnsList()
	{
		List<String> list = new ArrayList<>();
		list.add(College_col1);
		list.add(College_col2);
		list.add(College_col3);
		list.add(College_col4);
		
		return list;
		
	}
	
	/*
	 * 	private String CCode;
	private String CoName;
	private String Credits;
	private String Level;
	private String Cdesc;
	private String DCode;
	 */
	
	public static final String Table_Name_2 = "Course";
	public static final String Course_col1 = "College Name";
	public static final String Course_col2 = "Collge Code";
	public static final String Course_col3 = "Credits";
	public static final String Course_col4 = "Cdesc";
	public static final String Course_col5 = "Level";
	public static final String Course_col6 = "DepartmentCode";
	
	public static List<String> getCourseColumnsList()
	{
		List<String> list = new ArrayList<>();
		list.add(Course_col1);
		list.add(Course_col2);
		list.add(Course_col3);
		list.add(Course_col4);
		list.add(Course_col5);
		list.add(Course_col6);
		
		return list;
		
	}
	
	/*
	 * public String DCode;
	public String DName;
	public String DOffice;
	public long DPhone;
	public Date ChairStartDate;
	public String CName;
	public String ChairId;
	 */
	
	public static final String Table_Name_3 = "Department";
	public static final String Department_col1 = "Department Code";
	public static final String Department_col2 = "Department Name";
	public static final String Department_col3 = "Department Office";
	public static final String Department_col4 = "Chair Start Date";
	public static final String Department_col5 = "Chair Name";
	public static final String Department_col6 = "Chair ID";
	public static final String Department_col7 = "Department Number";
	
	public static List<String> getDepartmentColumnsList()
	{
		List<String> list = new ArrayList<>();
		list.add(Department_col1);
		list.add(Department_col2);
		list.add(Department_col3);
		list.add(Department_col4);
		list.add(Department_col5);
		list.add(Department_col6);
		list.add(Department_col7);
		
		return list;
		
	}

    /*
     * 	public String Id;
	public String IName;
	public int Rank;
	public String IOffice;
	public long IPhone;
	public String DCode;
     */
	public static final String Table_Name_4 = "Instrcutor";
	public static final String Instructor_col1 = "ID";
	public static final String Instructor_col2 = "Instructor Name";
	public static final String Instructor_col3 = "Rank";
	public static final String Instructor_col4 = "Instructor Office";
	public static final String Instructor_col5 = "Instrcutor Phone";
	public static final String Instructor_col6 = "Department Code";

	public static List<String> getInstructorColumnsList()
	{
		List<String> list = new ArrayList<>();
		list.add(Instructor_col1);
		list.add(Instructor_col2);
		list.add(Instructor_col3);
		list.add(Instructor_col4);
		list.add(Instructor_col5);
		list.add(Instructor_col6);
		
		return list;
		
	}
	
	/*
	 * 	public int SecNo;
	public int Sem;
	public int year;
	public int RoomNo;
	public String Bldg;
	public int DaysTime;
	public String CCode;
	public String InstructorId;
	 */
	
	public static final String Table_Name_5 = "Section";
	public static final String Section_col1 = "Section No.";
	public static final String Section_col2 = "Semester";
	public static final String Section_col3 = "Year";
	public static final String Section_col4 = "Room No.";
	public static final String Section_col5 = "Bldg";
	public static final String Section_col6 = "Days Time";
	public static final String Section_col7 = "CCode";
	public static final String Section_col8 = "Instructor ID";
	
	public static List<String> getSectionColumnsList()
	{
		List<String> list = new ArrayList<>();
		list.add(Section_col1);
		list.add(Section_col2);
		list.add(Section_col3);
		list.add(Section_col4);
		list.add(Section_col5);
		list.add(Section_col6);
		list.add(Section_col7);
		list.add(Section_col8);
		
		return list;
		
	}
	
	/*
	 * public String StudentID;
	public Date date;
	public String Fname;
	public String Mname;
	public String Lname;
	public String Address;
	public long Phone;
	public String  Major;
	public String DCode;
	 */
	
	public static final String Table_Name_6 = "Student";
	public static final String Student_col1 = "Student ID";
	public static final String Student_col2 = "date";
	public static final String Student_col3 = "First Name";
	public static final String Student_col4 = "Middle Name";
	public static final String Student_col5 = "Last Name";
	public static final String Student_col6 = "Address";
	public static final String Student_col7 = "Phone";
	public static final String Student_col8 = "Major";
	public static final String Student_col9 = "DCode";
	
	public static List<String> getStudentColumnsList()
	{
		List<String> list = new ArrayList<>();
		list.add(Student_col1);
		list.add(Student_col2);
		list.add(Student_col3);
		list.add(Student_col4);
		list.add(Student_col5);
		list.add(Student_col6);
		list.add(Student_col7);
		list.add(Student_col8);
		list.add(Student_col9);
		
		return list;
		
	}
	/*
	 * 	public String Grade;
	public String SId;
	public String SecId;
	 */
	public static final String Table_Name_7 = "Takes";
	public static final String Takes_col1 = "Student ID";
	public static final String Takes_col2 = "Section ID";
	public static final String Takes_col3 = "Grade";
	
	public static List<String> getTakesColumnsList()
	{
		List<String> list = new ArrayList<>();
		list.add(Takes_col1);
		list.add(Takes_col2);
		list.add(Takes_col3);
		
		return list;
		
	}
}
