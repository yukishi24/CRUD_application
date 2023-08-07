package com.example.demo.repository.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeDAO;

@Repository("EmployeeDAOJDBC")
public class EmplyeeDAOJDBC implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Employee> selectMany() throws DataAccessException {
		// 全件select
		List<Map<String, Object>> getList = jdbc.queryForList("select * from employee");
		// 結果返却用の変数
		List<Employee> EmployeeList = new ArrayList<>();
		// 取得したデータを結果返却用変数に代入していく
		for (Map<String, Object> map : getList) {
			// employeeインスタンスを生成する。
			Employee employee = new Employee();
			employee.setId((Integer) map.get("id"));
			employee.setName((String) map.get("name"));
			EmployeeList.add(employee);
		}
		return EmployeeList;
	}

}
