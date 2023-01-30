package com.withoutxml;

import java.util.List;

public interface StudentDao {
	public int insert(Student student);
	public void delete(int id);
	public void update(int id);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
}
