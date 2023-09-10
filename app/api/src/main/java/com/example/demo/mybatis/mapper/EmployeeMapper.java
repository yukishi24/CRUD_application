package com.example.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.mybatis.entity.Employee;

@Mapper
public interface EmployeeMapper {
	/**
	 * Employeeを全体選択
	 * 
	 * @return
	 */
	 public List<Employee> findAll();
}
