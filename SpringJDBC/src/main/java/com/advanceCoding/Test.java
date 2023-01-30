package com.advanceCoding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/advanceCoding/config.xml");
		EmployeeDaoImpl obj=con.getBean("impl",EmployeeDaoImpl.class);
		Employee emp=new Employee(44,"tanya mittal",1009.12);
		System.out.println(obj.insert(emp));
	
	
	}
}
