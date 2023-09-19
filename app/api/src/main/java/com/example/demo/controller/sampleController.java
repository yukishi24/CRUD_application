package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.M_Employee;
import com.example.demo.service.EmployeeService;

import lombok.RequiredArgsConstructor;

/**
 * dbのデータを出力するコントローラー
 * 
 * @author yukishi
 *
 */
@RestController
@RequiredArgsConstructor
public class sampleController {

	/**
	 * 従業員情報サービス
	 */
	@Autowired
	private EmployeeService service;

	/**
	 * サンプルメソッド
	 * 
	 * @return
	 */
	@GetMapping("/sample")
	public String getJava() {
		return "Java最高！！！！！";
	}

	/**
	 * 従業員情報を出力する
	 * 
	 * @return 従業員情報
	 */
	@GetMapping("/result")
	public List<M_Employee> getEmployeeList() {
		return service.getEmployees();
	}
}
