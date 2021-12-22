package com.andalossi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.andalossi.models.Student;
import com.andalossi.services.LoginService;
import com.andalossi.services.StudentService;
import com.andalossi.validation.CustomValidator;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService ;
	
	@Autowired
	CustomValidator customValidator;
	
	@RequestMapping(value ="/students" , method = RequestMethod.GET )
	public String showStudentPage(ModelMap map	) {
		map.addAttribute("sts", studentService.readAllStudents());
		return "students";
	}
	@RequestMapping(value ="/add" , method = RequestMethod.GET )
	public String addStudentPage() {
				return "addstudent";
	}
	@RequestMapping(value ="/add" , method = RequestMethod.POST )
	public String addStudentPageconfirm(ModelMap model , Student st) {
		//model.clear();
		if (!customValidator.checknamevalidate(st.getName())) {
			model.addAttribute("error", "minimum 3 lettre please");
			return "addstudent";
		}
		studentService.addStudent(st.getName() ,st.getIsActive());
		
		return "redirect:students";
	}
	@RequestMapping(value ="/delete" , method = RequestMethod.GET )
	public String deleteStudentPageconfirm(ModelMap model ,@RequestParam int id
			) {
		
		studentService.deleteStudent(id);
		model.clear();
		return "redirect:students";
	}
	@RequestMapping(value ="/edit" , method = RequestMethod.GET )
	public String editStudent(ModelMap model ,@RequestParam int id
			) {
		model.addAttribute("sts", studentService.getStudent(id));
		
		
		return "edit";
	}
	@RequestMapping(value ="/update" , method = RequestMethod.POST )
	public String updateStudentPageconfirm(ModelMap model ,Student stu) {
		System.out.println(stu.getId());
	//	model.addAttribute(null, stu)
		studentService.updateStudent(stu.getId(),stu.getName(),stu.getIsActive());
		
		return "redirect:students";
	}
	
}
