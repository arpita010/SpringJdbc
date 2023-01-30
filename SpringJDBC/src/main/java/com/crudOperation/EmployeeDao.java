package com.crudOperation;

import java.util.List;

public interface EmployeeDao {
	public int insert(Employee emp);
	public void update(int eid);
	public void delete(int eid);
	public Employee getEmployee(int eid);
	public List<Employee> getAllEmployees();
}
