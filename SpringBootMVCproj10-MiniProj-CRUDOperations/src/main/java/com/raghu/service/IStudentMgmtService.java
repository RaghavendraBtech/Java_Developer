package com.raghu.service;

import com.raghu.entity.Student;

public interface IStudentMgmtService {
	
	public String studentRegister(Student std);
	public Iterable<Student> getAllStudents();
	public Student getStudentById(int stdId);
	public String updateStudent(Student std);
	public String deleteStudentById(int stdId);

}
