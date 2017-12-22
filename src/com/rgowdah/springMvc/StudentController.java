package com.rgowdah.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showForm(Model model){
		//create student object
		Student student=new Student();
		//Add student object to the model
		model.addAttribute("student",student);
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student){
		System.out.println("the student:"+student.getFirstName()+" "+student.getLastName());
		return "student-confirmation";
	}
}
