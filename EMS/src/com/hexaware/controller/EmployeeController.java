package com.hexaware.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.EmployeeDao;
import com.hexaware.model.Employee;
import com.hexaware.model.Salary;

public class EmployeeController implements EmployeeInterface {
	List<Employee> empList = new ArrayList<Employee>();
	Employee emp;
	Salary sal;
	Scanner sc = new Scanner(System.in);

	EmployeeDao dao = new EmployeeDao();

	public void addEmployee() {
		emp = new Employee();
		System.out.println("Enter Empno");
		int eid = sc.nextInt();
		emp.setEmpno(eid);
		System.out.println("Enter Ename");
		String ename = sc.next();
		emp.setEname(ename);

		sal = new Salary();
		System.out.println("Enter Basic Salary");
		int basic = sc.nextInt();
		sal.setBasic(basic);
		sal.setHra();
		sal.setPf();
		sal.setGross();
		sal.setNet();

		emp.setSal(sal);

		empList.add(emp);
		dao.createEmployee(emp);
		System.out.println("Employee " + eid + " added Successfully !!!");
	}

	public void viewEmployee() {
		// System.out.println("Eid : "+ emp.getEmpno() + " Ename : " + emp.getEname());
		System.out.println("*** " + empList + "****");
		System.out.println("Data From DB");
		dao.showEmployee();
	}
	
	public void updateEmployee() {
		emp = new Employee();
		System.out.println("Enter Empno");
		int eid = sc.nextInt();
		emp.setEmpno(eid);
		System.out.println("Enter Ename");
		String ename = sc.next();
		emp.setEname(ename);
		dao.updateEmployee(emp);
	}



	@Override
	public void sortByEnameUsingComparator() {

	}

	@Override
	public void deleteEmplyee() {
		emp = new Employee();
		System.out.println("Enter Empno");
		int eid = sc.nextInt();
		emp.setEmpno(eid);
		dao.updateEmployee(emp);
		
	}

}