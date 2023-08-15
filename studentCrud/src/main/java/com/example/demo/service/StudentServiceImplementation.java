package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepositiry;

@Service
public class StudentServiceImplementation implements StudentService
{
	StudentRepositiry srepo;

	public StudentServiceImplementation(StudentRepositiry srepo) {
		super();
		this.srepo = srepo;
	}

	@Override
	public String addStudent(Student s) {
		// TODO Auto-generated method stub
		srepo.save(s);
		return "Student added";
	}

	@Override
	public Student getStudent(String kodId) {
		// TODO Auto-generated method stub
	    Student st=srepo.findById(kodId).get();
		return st;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> slist=srepo.findAll();
		return slist;
	}

	@Override
	public String updateStudent(Student s) {
		// TODO Auto-generated method stub
		srepo.save(s);
		return "Student updated";
	}

	@Override
	public String deleteStudent(String kodId) {
		// TODO Auto-generated method stub
		srepo.deleteById(kodId);
		return "Student deleted";
	}
}
