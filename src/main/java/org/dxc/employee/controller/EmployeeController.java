package org.dxc.employee.controller;

import java.util.List;
import java.util.logging.Logger;

import org.dxc.employee.model.Employee;
import org.dxc.employee.service.EmployeeService;
import org.dxc.employee.utility.DBConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	private Logger logger=Logger.getLogger(EmployeeController.class.getName());
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping("/")
	public String showIndexPage() {
		return "index";
	}
	@RequestMapping("/viewemployees")
	public String showEmployees(ModelMap map) {
		List<Employee> listOfEmployees=employeeService.getEmployees();
		logger.info("showEmployee"+listOfEmployees.get(0).getId()+" "+listOfEmployees.get(1).getEmpname()+" "+listOfEmployees.get(2).getSalary());
		map.addAttribute("listOfEmployees",listOfEmployees);
		return "viewemployees";
	}
	@RequestMapping("/contact")
	public String contactPage() {
		logger.info("=========contactPage()called=============="); 
		return "contact";
	}
}

