package com.microservices.department_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.department_app.response.DepartmentResponse;
import com.microservices.department_app.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService deptService;
	@GetMapping("/department")
	public List<DepartmentResponse> getDepartmentDetails(){
		return deptService.getDepartmentDetails();
		
	} 
	@GetMapping("/department/{employeeId}")
	public DepartmentResponse findDepartmentByEmployeeId(@PathVariable ("employeeId") int employeeId){
		return deptService.getDepartmentDetailsByEmployeeId(employeeId);
		
	}

}
