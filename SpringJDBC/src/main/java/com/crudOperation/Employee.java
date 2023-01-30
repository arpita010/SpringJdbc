package com.crudOperation;

import org.springframework.stereotype.Component;

public class Employee {
	private int eid;
	private String eName;
	private int dId;
	private boolean isManager;
	public int getEid() {
		return eid;
	}
	public String geteName() {
		return eName;
	}
	public int getdId() {
		return dId;
	}
	public boolean isManager() {
		return isManager;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", dId=" + dId + ", isManager=" + isManager + "]";
	}
	
}
