package com.microservices.department_app.response;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class DepartmentResponse {

	private int department_id;
	
	private String department_name;
}
