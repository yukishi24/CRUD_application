package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.M_Employee;
import com.example.demo.repository.Employee_mapper;

/**
 * 従業員情報サービス
 * 
 * @author yukishi
 *
 */
@Service
public class EmployeeService {
	/**
	 * 従業員情報マッパー
	 */
	@Autowired
	private Employee_mapper mapper;

	/**
	 * 従業員情報(一覧)取得メソッド
	 * 
	 * @return
	 */
	public List<M_Employee> getEmployees() {
		return mapper.getEmployeeList();
	}
}
