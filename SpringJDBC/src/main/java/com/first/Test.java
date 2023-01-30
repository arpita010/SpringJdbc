package com.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/first/config.xml");
		JdbcTemplate temp = con.getBean("jdbcTemplateObject", JdbcTemplate.class);
		//direct query
		String query = "insert into Student(id,name,city)values(1,'arpita','meerut');";
		//indirect query
		String query1 = "insert into Student(id,name,city)values(?,?,?);";
		int row=temp.update(query1, 2,"mittal","meerut");
		int row1=temp.update(query);
		System.out.println("number of rows affected  : "+row);
		System.out.println("number of rows affected  : "+row1);
		
	}
}
