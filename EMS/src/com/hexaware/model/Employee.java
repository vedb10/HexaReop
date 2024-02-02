package com.hexaware.model;

import java.util.Comparator;

import com.hexaware.model.Employee;

public class Employee {
	private int empno;
	private String ename;
	private Salary sal;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	

	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}	
	public int compareTo(Employee e) {	
		return this.getEmpno() - e.getEmpno();
	}
	public Comparator<Employee>  nameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {

			return e1.getEname().compareTo(e2.getEname());
		}
			
	};
	
	public Comparator<Employee>  empnoComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {

			return e1.getEmpno() - e2.getEmpno();
		}
			
	};
}



