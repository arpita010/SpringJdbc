package com.withoutxml;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
		StudentDaoImpl dao=con.getBean("studentDao",StudentDaoImpl.class);
//		Student student=new Student();
//		student.setId(17);
//		student.setName("user");
//		student.setCity("Meerut");
//		int rows =dao.insert(student);
//		System.out.println("Row inserted  "+rows);
//		dao.update(16);
//		dao.delete(16);
//		Student stu=dao.getStudent(18);
//		System.out.println(stu);
		List<Student> list=dao.getAllStudents();
		for(Student s:list)
		{
			System.out.println(s);
		}
			
	}
}
