package com.microservices.department_app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.department_app.entity.Department;
import com.microservices.department_app.repository.DepartmentRepository;
import com.microservices.department_app.response.DepartmentResponse;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository deptRepo;
	@Autowired
	private ModelMapper modelMapper;
	public List<DepartmentResponse> getDepartmentDetails(){
List<Department> department = deptRepo.findAll();
List<DepartmentResponse> response = department.stream().map(d->modelMapper.map(d, DepartmentResponse.class)).collect(Collectors.toList());
		return response;
		
	}
	public DepartmentResponse getDepartmentDetailsByEmployeeId(int employeeId) {
	Department department = deptRepo.findByEmployeeId(employeeId);
	DepartmentResponse response = modelMapper.map(department, DepartmentResponse.class);
		return response;
	}

}
