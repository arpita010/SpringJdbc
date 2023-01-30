package com.advanceCoding;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	JdbcTemplate temp;
	public int insert(Employee emp) {
		String query = "insert into Employee(eid,name,salary)values(?,?,?); ";
		
		int rows=temp.update(query,emp.getEid(),emp.getName(),emp.getSalary());
		return rows;
	}
	public JdbcTemplate getTemp() {
		return temp;
	}
	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	
}
