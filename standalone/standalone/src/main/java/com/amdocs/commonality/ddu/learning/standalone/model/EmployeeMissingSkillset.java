package com.amdocs.commonality.ddu.learning.standalone.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeMissingSkillset {
	String empId;
	List<String> missingSKills =new ArrayList<>();
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public List<String> getMissingSKills() {
		return missingSKills;
	}
	public void setMissingSKills(List<String> missingSKills) {
		this.missingSKills = missingSKills;
	}
	
}
