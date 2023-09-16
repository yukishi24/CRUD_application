package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeMapper;
import com.example.demo.service.EmployeeService;

/**
 * MybatisとSpring bootを繋げる為のサービス実装クラス
 * 
 * @author yukishi
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public List<Employee> getEmployeeList(Employee employee) {
		return employeeMapper.findMany(employee);
	}

}
