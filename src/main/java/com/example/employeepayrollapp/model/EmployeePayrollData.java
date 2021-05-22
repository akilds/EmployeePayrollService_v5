package com.example.employeepayrollapp.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

@Entity
@Table(name = "employee_payroll")
public @Data class EmployeePayrollData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	
	@Column(name = "name")
	private String name;
	private long salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;
	
	@ElementCollection
	@CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name = "id"))
	@Column(name = "department")
	public List<String> departments;
	
	public EmployeePayrollData() {}
	
	public EmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		this.updateEmployeePayrollData(empPayrollDTO);
	}

	public void updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		this.name = empPayrollDTO.name;
		this.salary = empPayrollDTO.salary;
		this.gender = empPayrollDTO.gender;
		this.note = empPayrollDTO.note;
		this.startDate = empPayrollDTO.startDate;
		this.profilePic = empPayrollDTO.profilePic;
		this.departments = empPayrollDTO.departments;
	}	
}
