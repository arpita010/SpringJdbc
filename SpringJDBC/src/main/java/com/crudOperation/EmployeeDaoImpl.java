package com.crudOperation;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	JdbcTemplate jt;

	public int insert(Employee emp) {
		String query = "insert into Employee(eid,eName,dId,isManager)values(?,?,?,?);";
		int r = jt.update(query, emp.getEid(), emp.geteName(), emp.getdId(), emp.isManager());
		return r;
	}

	public void update(int eid) {
		String query="update Employee set eName=? where eid=?";
		jt.update(query, "updated",eid);
		System.out.println("Employee updated...");
	}
	

	public void delete(int eid) {
		String query="delete from Employee where eid=?";
		jt.update(query,eid);
		System.out.println("Deleted succesfully employee id= "+eid);
	}

	public Employee getEmployee(int eid) {
		RowMapper<Employee> rowMapper=new EmployeeRowMapperImpl();
		String query="select * from Employee where eid=?";
		Employee emp=jt.queryForObject(query, rowMapper,eid);
		return emp;
	}

	public List<Employee> getAllEmployees() {
		RowMapper<Employee> rowMapper=new EmployeeRowMapperImpl();
		String query="select * from Employee";
		List<Employee> list=jt.query(query, rowMapper);
		return list;
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

}
