package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mybatis.mapper.EmployeeMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DBController {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@GetMapping("/sample")
	public String getsample() {
		return "きてるよ";
	}
}
