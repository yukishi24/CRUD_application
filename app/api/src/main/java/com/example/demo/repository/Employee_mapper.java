package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.M_Employee;

/**
 * sql処理を記述するインターフェース
 * 
 * @author yukishi
 *
 */
@Mapper
public interface Employee_mapper {
	/**
	 * DBから従業員リストを取得する処理
	 * @return 従業員一覧
	 */
	List<M_Employee> getEmployeeList();
}
