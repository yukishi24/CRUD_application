package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mybatis.entity.Employee;
import com.example.demo.mybatis.mapper.EmployeeMapper;

@Service
public class employeeService {
	@Autowired
	private EmployeeMapper employeeMapper;

	/**
	 * Employee取得処理
	 * 
	 * @return Employee情報
	 */
	public List<Employee> selectAll() {
		return employeeMapper.selectAll();
	}
}
