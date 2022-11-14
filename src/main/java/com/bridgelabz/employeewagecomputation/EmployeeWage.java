package com.bridgelabz.employeewagecomputation;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
        
		int wagePerHour = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int dailyWage = 0;

        int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
//uc3-part time employee wage
        /*if (employeeCheck == 2) {
            dailyWage = fullTimeHour * wagePerHour;
            System.out.println("Employee is present full time");
        } else if (employeeCheck == 1) {
            dailyWage = partTimeHour * wagePerHour;
            System.out.println("Employee is present half time");
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("Employee total wage is: " +dailyWage); */
//UC4-using switch case
        switch (employeeCheck) {
        case 2:
            dailyWage = fullTimeHour * wagePerHour;
            System.out.println("Employee is present full time");
            break;
        case 1:
            dailyWage = partTimeHour * wagePerHour;
            System.out.println("Employee is present half time");
            break;
        default:
            System.out.println("Employee is absent");
    }
    System.out.println("Employee total wage is: " +dailyWage);
    }
}



