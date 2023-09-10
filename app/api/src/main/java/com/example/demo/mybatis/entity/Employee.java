package com.example.demo.mybatis.entity;

import lombok.Data;

/**
 * Employee情報を格納するEntity
 * @author yukishi
 *
 */
@Data
public class Employee {
	private int employee_id;
	private String employee_name;
	private String admin;
}
