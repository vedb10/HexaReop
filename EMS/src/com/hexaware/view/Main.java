package com.hexaware.view;
import java.util.ArrayList;
import java.util.List;

class Employee {
    int empno;
    String ename;

    public Employee(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }
}

class Manager {
    int eno;
    String ename;
    List<Employee> employees;

    public Manager(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating employee instances
        Employee emp1 = new Employee(1, "John");
        Employee emp2 = new Employee(2, "Jane");
        Employee emp3 = new Employee(3, "Alice");

        // Creating manager instance
        Manager manager = new Manager(101, "Manager Bob");

        // Adding employees to the manager's list
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        // Printing manager details
        System.out.println("Manager Details:");
        System.out.println("ENO: " + manager.eno);
        System.out.println("ENAME: " + manager.ename);
        System.out.println("Employees under the manager:");
        
        for (Employee employee : manager.employees) {
            System.out.println("EmpNo: " + employee.empno + ", EName: " + employee.ename);
        }
    }
}




