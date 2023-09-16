package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Employee;

/**
 * mybatisの処理を記述するインターフェース
 * 
 * @author yukishi
 *
 */
@Mapper
public interface EmployeeMapper {

	public List<Employee> findMany(Employee employee);
}
