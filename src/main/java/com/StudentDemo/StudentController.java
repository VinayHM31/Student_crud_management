package com.StudentDemo;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/students")
	public String showStudentList(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "student-list";
	}

	@GetMapping("/students/{id}")
	public String showStudentDetails(@PathVariable Long id, Model model) {
		Student student = studentService.getStudentById(id);
		model.addAttribute("student", student);
		return "student-details";
	}

	@GetMapping("/students/new")
	public String showCreateStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}

	@GetMapping("/students/{id}/edit")
	public String showEditStudentForm(@PathVariable Long id, Model model) {
		Student student = studentService.getStudentById(id);
		model.addAttribute("student", student);
		return "student-form";
	}

	@GetMapping("/students/{id}/delete")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return "redirect:/student-list";
	}
}