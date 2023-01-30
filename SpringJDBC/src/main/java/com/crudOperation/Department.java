package com.crudOperation;

public class Department {
	private int dId;
	private String dName;
	private int numberOfEmployees;
	private Employee manager;
	public int getdId() {
		return dId;
	}
	public String getdName() {
		return dName;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public Employee getManager() {
		return manager;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", numberOfEmployees=" + numberOfEmployees + ", manager="
				+ manager + "]";
	}
	
}
