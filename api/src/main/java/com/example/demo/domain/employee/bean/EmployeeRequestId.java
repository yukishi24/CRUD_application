/**
 * 
 */
package com.example.demo.domain.employee.bean;

import java.io.Serializable;

import lombok.Data;

/**
 * Employee情報検索用ID
 * 
 * @author yukishi
 *
 */
@Data
public class EmployeeRequestId implements Serializable {
	private int id;
}
