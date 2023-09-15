package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.form.EmployeeRecord;
import com.example.demo.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class resultController {
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private EmployeeService employeeService;
	
	 @Autowired
	 private EmployeeRecord record;
	 
	 @GetMapping("/result")
	 public List<Employee> getResult() {
		Employee employee = modelMapper.map(record, Employee.class);
		List<Employee> resultMap = employeeService.getEmployeeList(employee);
		return resultMap;
	}

}
