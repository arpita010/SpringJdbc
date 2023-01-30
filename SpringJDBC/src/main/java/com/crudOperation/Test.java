package com.crudOperation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/crudOperation/config.xml");
		EmployeeDaoImpl empl = con.getBean("emp", EmployeeDaoImpl.class);
		DepartmentDaoImpl dmpl = con.getBean("dep", DepartmentDaoImpl.class);
		//inserting data
//		Employee emp = new Employee();
//		emp.setEid(900);
//		emp.seteName("User");
//		emp.setdId(7);
//		emp.setManager(false);
//		Department d = new Department();
//		d.setdId(10);
//		d.setdName("ITSector9");
//		d.setManager(emp);
//		d.setNumberOfEmployees(500);
//		int e = empl.insert(emp);
//		int dnum = dmpl.insert(d);
//		System.out.println("Employee inserted : " + e);
//		System.out.println("Department inserted : " + dnum);
		//updating data
		empl.update(500);
		dmpl.update(7);
		//deleting details
		empl.delete(700);
		dmpl.delete(7);
		//getting single employee and department
		Employee emp=empl.getEmployee(100);
		Department dept=dmpl.getDepartment(1);
		System.out.println(emp);
		System.out.println(dept);
		
//		getting all records of employees;
		for(Employee e:empl.getAllEmployees())
		{
			System.out.println(e);
		}
//		 getting all records of department
		for(Department d:dmpl.getAllDepartments())
		{
			System.out.println(d);
		}
		
	}
}
