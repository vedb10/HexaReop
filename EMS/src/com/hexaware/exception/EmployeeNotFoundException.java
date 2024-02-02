package com.hexaware.exception;

public class EmployeeNotFoundException extends Exception{

	public EmployeeNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeNotFoundException(String message) {
		super(message);
		System.out.println(message);
	}

//	@Override
//	public String toString() {
//		return "EmployeeNotFoundException []";
//	}

}