package com.example.demo.entity;

import lombok.Data;

/**
 * Employeeのテーブルのやり取り用のエンティティクラス
 * 
 * @author yukishi
 *
 */
@Data
public class M_Employee {
	/**
	 * 従業員のid
	 */
	private int employee_id;

	/**
	 * 従業員名
	 */
	private String employee_name;

	/**
	 * 従業員の権限
	 */
	private String employee_admin;

}
