package com.withoutxml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	@Autowired
	JdbcTemplate temp;
	public int insert(Student student) {
		String query="insert into student_details(id,name,city) values(?,?,?);";
		int r=temp.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	public void delete(int id) {
		String query="delete from student_details where id=?";
		temp.update(query,id);
		System.out.println("deleted successfully with id = "+id);
	}

	public void update(int id) {
		String query="update student_details set name=?,city=? where id=?";
		temp.update(query,"updated","updated",id);
		System.out.println("updated successfully id = "+id);
	}

	public Student getStudent(int id) {
		RowMapper<Student> map=new StudentRowMapper();
		String query="select * from student_details where id=?";
		Student stu=temp.queryForObject(query,map, id);
		return stu;
	}

	public List<Student> getAllStudents() {
		String query="select * from student_details";
		RowMapper<Student> map=new StudentRowMapper();
		
		List<Student> list=temp.query(query,map);
		return list;
	}

	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

}
