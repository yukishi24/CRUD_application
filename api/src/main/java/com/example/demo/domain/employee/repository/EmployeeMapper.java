package com.example.demo.domain.employee.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.employee.bean.EmployeeRequestId;
import com.example.demo.domain.employee.entity.MEmployee;

/**
 * Employee情報:Mapper
 * 
 * @author yukishi
 *
 */
@Mapper
public interface EmployeeMapper {
	MEmployee getEmployeeInfo (EmployeeRequestId id);
}
