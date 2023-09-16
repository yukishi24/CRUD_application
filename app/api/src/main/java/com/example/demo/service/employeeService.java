package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

/**
 * mybatisの処理を使用する為のサービスインターフェース
 * 
 * @author yukishi
 *
 */
public interface EmployeeService {
	public List<Employee> getEmployeeList(Employee employee);
}
