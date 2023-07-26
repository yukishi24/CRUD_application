package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.user.model.Employee;

@Mapper
public interface EmployeeMapper {
	public Employee getEmployee(int id);
}
