package com.example.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.mybatis.entity.Employee;

@Mapper
public interface EmployeeMapper {
	/**
	 * Employeeの情報取得
	 * 
	 * @return 全Employee情報
	 */
	List<Employee> selectAll();
}
