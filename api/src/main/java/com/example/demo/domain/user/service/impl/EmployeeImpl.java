package com.example.demo.domain.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.user.model.Employee;
import com.example.demo.domain.user.service.EmployeeService;
import com.example.demo.repository.EmployeeMapper;
@Service
public class EmployeeImpl implements EmployeeService {
	@Autowired
	private EmployeeMapper mapper;
	@Override
	public List<Employee> findInfo() {
		ArrayList<Employee> result = new ArrayList<Employee>();
		result.add(mapper.getEmployee(1));
		result.add(mapper.getEmployee(2));
		return result;
	}

}
