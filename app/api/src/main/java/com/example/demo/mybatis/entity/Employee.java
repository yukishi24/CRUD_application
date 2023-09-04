package com.example.demo.mybatis.entity;

import lombok.Data;

/**
 * Employee情報を格納するEntity
 * @author yukishi
 *
 */
@Data
public class Employee {
	private int id;
	private String name;
	private String admin;
}
