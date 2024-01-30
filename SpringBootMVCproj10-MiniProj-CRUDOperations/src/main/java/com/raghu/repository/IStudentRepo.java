package com.raghu.repository;

import org.springframework.data.repository.CrudRepository;

import com.raghu.entity.Student;

public interface IStudentRepo extends CrudRepository<Student, Integer> {

}
