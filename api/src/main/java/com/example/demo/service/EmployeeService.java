package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeDAO;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class EmployeeService {
	@Autowired
	@Qualifier("EmployeeDAOJDBC")
	private EmployeeDAO dao;
	
	public List<Employee> selectMany() {
		return dao.selectMany();
	}
}
