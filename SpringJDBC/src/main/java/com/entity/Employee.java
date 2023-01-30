package com.entity;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	public Employee()
	{
		
	}
	public Employee(int eid,String name,double salary)
	{
		super();
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	public int getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
