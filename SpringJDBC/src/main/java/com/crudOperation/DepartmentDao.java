package com.crudOperation;

import java.util.List;

public interface DepartmentDao {
	public int insert(Department d);
	public void update(int dId);
	public void delete(int dId);
	public Department getDepartment(int dId);
	public List<Department> getAllDepartments();
}
