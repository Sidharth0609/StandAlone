package com.amdocs.commonality.ddu.learning.standalone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeMissingSkillset;
import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeSkillset;



@Service
public class ValidateSkillsApplicationService {
	@Autowired
	EmployeeMissingSkillset employeeMissingSkillset;
	
	public EmployeeMissingSkillset validateSkills(EmployeeSkillset employeeSkillset) {
		employeeMissingSkillset.setEmpId(employeeSkillset.getEmpId());
		employeeSkillset.getRequiredSkills().removeIf(skill -> employeeSkillset.getActualSkills().stream()
				.anyMatch(skill2 -> skill2.equalsIgnoreCase(skill)));
		employeeMissingSkillset.setMissingSKills(employeeSkillset.getRequiredSkills());
		return employeeMissingSkillset;
	}
}
