package com.crudOperation;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapperImpl implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setEid(rs.getInt("eid"));
		emp.seteName(rs.getString("eName"));
		emp.setManager(rs.getBoolean("isManager"));
		emp.setdId(rs.getInt("dId"));
		return emp;
	}

}
