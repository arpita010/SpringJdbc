package com.crudOperation;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DepartmentRowMapper implements RowMapper<Department> {

	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department d = new Department();
		EmployeeDaoImpl empl = new EmployeeDaoImpl();
		d.setdId(rs.getInt("dId"));
		d.setdName(rs.getString("dName"));
		d.setNumberOfEmployees(rs.getInt("numberOfEmployees"));
//		d.setManager(empl.getEmployee(rs.getInt("managerId")));
		return d;
	}

}
