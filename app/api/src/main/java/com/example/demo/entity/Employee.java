package com.example.demo.entity;

import lombok.Data;

/**
 * sampleDB「Employee」テーブルのデータをコントロールするエンティティクラス
 * 
 * @author yukishi
 *
 */
@Data
public class Employee {
	private int employee_id;
	private String employee_name;
	private String employee_admin;
}
