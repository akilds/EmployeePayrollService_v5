package com.example.employeepayrollapp.services;

import java.util.List;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {
	List<EmployeePayrollData> getEmployeePayrollData();
	EmployeePayrollData getEmployeePayrollDataById(int empId);
	List<EmployeePayrollData> getEmployeeByDepartment(String Department);
	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO emploPayrollDTO);
	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO);
	void deleteEmployeePayrollData(int empId);
}
