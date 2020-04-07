package com.dbms.university.controller;

import java.util.List;
import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbms.university.Constant;
import com.dbms.university.model.College;
import com.dbms.university.model.Course;
import com.dbms.university.model.Department;
import com.dbms.university.model.Instructor;
import com.dbms.university.model.Section;
import com.dbms.university.model.Student;
import com.dbms.university.model.Takes;
import com.dbms.university.repository.CollegeRepository;
import com.dbms.university.repository.CourseRepository;
import com.dbms.university.repository.DepartmentRepository;
import com.dbms.university.repository.InstructorRepository;
import com.dbms.university.repository.SectionRepository;
import com.dbms.university.repository.StudentRepository;
import com.dbms.university.repository.TakesRepository;

@Controller
public class CollegeController {
	
	@Autowired
	CollegeRepository collegeRepository;
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	DepartmentRepository dpartmentRepository;
	@Autowired
	InstructorRepository instructorRepository;
	@Autowired
	SectionRepository sectionRepository;
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	TakesRepository takesRepository;
	
	
	@GetMapping(path="/")
	public String listDownUniversirty()
	{
		return "university";
	}
	
	@GetMapping(path="/list")
	public String getAllCollege(ModelMap model, @RequestParam("tablename") String tablename)
	{
		List<List<String>> map = new ArrayList<>();
		if(tablename.equals("college"))
		{
			List<College> list = (List<College>) collegeRepository.findAll();
			for(College college: list)
			{
				List<String> lst = new ArrayList<>();
				lst.add(college.getCName());
				lst.add(college.getCOffice());
				lst.add(String.valueOf(college.getCPhone()));
				lst.add(college.getDeanid());
				map.add(lst);
				model.put("tablename", Constant.Table_Name_1);
				model.put("columnname", Constant.getCollegeColumnsList());
				model.put("data", map);
			}
		}
		else if(tablename.equals("course"))
		{
			List<Course> list = (List<Course>) courseRepository.findAll();
			for(Course course: list)
			{
				List<String> lst = new ArrayList<>();
				lst.add(course.getCoName());
				lst.add(course.getCCode());
				lst.add(String.valueOf(course.getCredits()));
				lst.add(course.getCdesc());
				lst.add(String.valueOf(course.getLevel()));
				lst.add(course.getDCode());
				
				map.add(lst);
				model.put("tablename", Constant.Table_Name_2);
				model.put("columnname", Constant.getCourseColumnsList());
				model.put("data", map);
			}
		}
		else if(tablename.equals("department"))
		{
			List<Department> list = (List<Department>) dpartmentRepository.findAll();
			for(Department department: list)
			{
				List<String> lst = new ArrayList<>();
				lst.add(department.getDCode());
				lst.add(department.getDName());
				lst.add(department.getDOffice());
				lst.add(String.valueOf(department.getChairStartDate()));
				lst.add(department.getCName());
				lst.add(department.getChairId());
				lst.add(String.valueOf(department.getDPhone()));
				
				
				
				map.add(lst);
				model.put("tablename", Constant.Table_Name_3);
				model.put("columnname", Constant.getDepartmentColumnsList());
				model.put("data", map);
			}
		}
		else if(tablename.equals("instructor"))
		{
			List<Instructor> list = (List<Instructor>) instructorRepository.findAll();
			for(Instructor instructor: list)
			{
				List<String> lst = new ArrayList<>();
				lst.add(instructor.getId());
				lst.add(instructor.getIName());
				lst.add(String.valueOf(instructor.getRank()));
				lst.add(instructor.getIOffice());
				lst.add(String.valueOf(instructor.getIPhone()));
				lst.add(instructor.getDCode());
								
				map.add(lst);
				model.put("tablename", Constant.Table_Name_4);
				model.put("columnname", Constant.getInstructorColumnsList());
				model.put("data", map);
			}
		}
		else if(tablename.equals("section"))
		{
			List<Section> list = (List<Section>) sectionRepository.findAll();
			for(Section section: list)
			{
				List<String> lst = new ArrayList<>();
				lst.add(section.getSecId());
				lst.add(String.valueOf(section.getSecNo()));
				lst.add(String.valueOf(section.getSem()));
				lst.add(String.valueOf(section.getYear()));
				lst.add(String.valueOf(section.getRoomNo()));
				lst.add(section.getBldg());
				lst.add(String.valueOf(section.getDaysTime()));
				lst.add(section.getCCode());
				lst.add(section.getInstructorId());
								
				map.add(lst);
				model.put("tablename", Constant.Table_Name_5);
				model.put("columnname", Constant.getInstructorColumnsList());
				model.put("data", map);
			}
		}
		else if(tablename.equals("student"))
		{
			List<Student> list = (List<Student>) studentRepository.findAll();
			for(Student student: list)
			{
				List<String> lst = new ArrayList<String>();
				lst.add(student.getStudentID());
				lst.add(String.valueOf(student.getDate()));
				lst.add(student.getFname());
				lst.add(student.getMname());
				lst.add(student.getLname());
				lst.add(student.getAddress());
				lst.add(String.valueOf(student.getPhone()));
				lst.add(student.getMajor());
				lst.add(student.getDCode());
				
				map.add(lst);
				model.put("tablename", Constant.Table_Name_6);
				model.put("columnname", Constant.getStudentColumnsList());
				model.put("data", map);
				
			}	
		}
		else if(tablename.equals("takes"))
		{
			List<Takes> list = (List<Takes>) takesRepository.findAll();
			for(Takes takes: list)
			{
				List<String> lst = new ArrayList<String>();
				lst.add(takes.getSId());
				lst.add(takes.getGrade());
				lst.add(takes.getSecId());
				
				map.add(lst);
				model.put("tablename", Constant.Table_Name_7);
				model.put("columnname", Constant.getTakesColumnsList());
				model.put("data", map);
			}
		}
		return "university";
	}

}
