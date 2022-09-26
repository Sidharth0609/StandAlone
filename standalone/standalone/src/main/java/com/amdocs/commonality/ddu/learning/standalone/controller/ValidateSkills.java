package com.amdocs.commonality.ddu.learning.standalone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeMissingSkillset;
import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeSkillset;
import com.amdocs.commonality.ddu.learning.standalone.service.ValidateSkillsApplicationService;

@RestController
public class ValidateSkills {
	
	@Autowired
	ValidateSkillsApplicationService validateSkillsApplicationService;
	
	@PostMapping("/employeemanagement/v1/validateEmployeeSkills")
	public ResponseEntity validateSkills(@RequestBody EmployeeSkillset employeeSkillset) {
		EmployeeMissingSkillset employeeMissingSkillset = validateSkillsApplicationService.validateSkills(employeeSkillset);
		return new ResponseEntity(employeeMissingSkillset, HttpStatus.CREATED);
	}
}

