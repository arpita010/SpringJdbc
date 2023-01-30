package com.crudOperation;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DepartmentDaoImpl implements DepartmentDao {
	JdbcTemplate temp;

	public int insert(Department d) {
		String query = "insert into Department(dId,dName,numberOfEmployees,managerId) values(?,?,?,?);";
		int r = temp.update(query, d.getdId(), d.getdName(), d.getNumberOfEmployees(), d.getManager().getEid());
		return r;
	}

	public void update(int dId) {
		String query = "update Department set dName=?,numberOfEmployees=? where dId=?";
		temp.update(query, "updated", -1, dId);
		System.out.println("Department updated....");
	}

	public void delete(int dId) {
		String query = "delete from Department where dId=?";
		temp.update(query, dId);
		System.out.println("Department deleted successfully with id " + dId);
	}

	public Department getDepartment(int dId) {

		String query = "select * from Department where dId=?";
		RowMapper<Department> rowMapper = new DepartmentRowMapper();
		Department d = temp.queryForObject(query, rowMapper, dId);
		return d;
	}

	public List<Department> getAllDepartments() {
		RowMapper<Department> rowMapper = new DepartmentRowMapper();
		String query = "select * from department";
		List<Department> list = temp.query(query, rowMapper);
		return list;
	}

	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

}
