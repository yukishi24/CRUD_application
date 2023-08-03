package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.employee.bean.EmployeeRequestId;
import com.example.demo.domain.employee.entity.MEmployee;
import com.example.demo.domain.employee.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class EmployeeController{
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get/info")
	public MEmployee getEmployeeInfo() {
		EmployeeRequestId i = new EmployeeRequestId();
		i.setId(1);
		return employeeService.getEmployeeInfo(i);
	}

}
