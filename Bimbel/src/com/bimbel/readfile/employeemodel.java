package com.bimbel.readfile;

import java.util.Date;

public class employeemodel {
	private int empId;
	private String employee;
	private String gender;
	private Date birthdate;
	private String address;
	private String city;
	
	//Source > generate constructor using field (deselect all)
	public employeemodel() {
		
	}

	//Source > generate constructor using field (select all)
	public employeemodel(int empId, String employee, String gender,
			Date birthdate, String address, String city) {
		this.empId = empId;
		this.employee = employee;
		this.gender = gender;
		this.birthdate = birthdate;
		this.address = address;
		this.city = city;
	}

	//Source > generate getter and setter (select all)
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmployee() {
		return employee;
	}


	public void setEmployee(String employee) {
		this.employee = employee;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	
	
	
	
}


