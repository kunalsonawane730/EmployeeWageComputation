package com.bridgelabz.employeewagecomputation;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Program");
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;

        if (employeeCheck == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
	}

}
