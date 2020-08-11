package org.dxc.employee.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dxc.employee.model.Employee;
import org.dxc.employee.utility.DBConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {
	
	private Employee employee;
	private Statement statement;
    private Connection connection;
    @Autowired(required=true)
    private List<Employee> listOfEmployees;
	public EmployeeDAO() {
		connection=DBConnection.getSqlConnection();
		//listOfEmployees=new ArrayList<Employee>();
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		try {
			statement=connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employee");
			
			while(resultSet.next()) {
	            employee=new Employee();
				employee.setId(181);
				employee.setEmpname("shazif");;
				employee.setSalary(40000);;
				listOfEmployees.add(employee);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listOfEmployees;
	}

}
