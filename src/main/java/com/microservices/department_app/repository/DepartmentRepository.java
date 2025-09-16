package com.microservices.department_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.microservices.department_app.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	@Query(nativeQuery = true, value ="select d.department_id, d.department_name from employee e join department d on e.department_id = d.department_id where e.id =:employeeId")
	Department findByEmployeeId(@Param ("employeeId") int employeeId);

}
