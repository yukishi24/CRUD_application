package com.example.demo.domain.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.employee.bean.EmployeeRequestId;
import com.example.demo.domain.employee.entity.MEmployee;
import com.example.demo.domain.employee.repository.EmployeeMapper;

/**
 * Employee情報:Service
 * 
 * @author yukishi
 *
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public MEmployee getEmployeeInfo(EmployeeRequestId id) {
		System.out.println("hello");
		return employeeMapper.getEmployeeInfo(id);
	}

}
