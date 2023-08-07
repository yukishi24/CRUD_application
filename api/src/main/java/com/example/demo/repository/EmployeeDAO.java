package com.example.demo.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.model.Employee;

public interface EmployeeDAO {
	// 全件取得
	public List<Employee>  selectMany() throws DataAccessException;
}
