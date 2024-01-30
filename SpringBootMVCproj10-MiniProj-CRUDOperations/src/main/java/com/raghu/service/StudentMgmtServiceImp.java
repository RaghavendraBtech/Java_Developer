package com.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghu.entity.Student;
import com.raghu.repository.IStudentRepo;

@Service
public class StudentMgmtServiceImp implements IStudentMgmtService {
	
	@Autowired
	private IStudentRepo stdRepo;

	@Override
	public String studentRegister(Student std) {
	
		return "Student is saved with Id value :: "+stdRepo.save(std).getStdId();
	}

	@Override
	public Iterable<Student> getAllStudents() {
		return stdRepo.findAll();
	}
	
	@Override
	public Student getStudentById(int stdId) {
		Student std=stdRepo.findById(stdId).orElseThrow(()-> new IllegalArgumentException());
		return std;
	}
	
	@Override
	public String updateStudent(Student std) {
		return "Student is updated with id value "+stdRepo.save(std).getStdId();
	}

	@Override
	public String deleteStudentById(int stdId) {
		stdRepo.deleteById(stdId);
		return stdId+" Student id is deleted";
	}

	

	
}
