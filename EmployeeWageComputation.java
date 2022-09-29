package EmployeeWage;

import EmployeeWageComputation.UC1_EmployeeAttendance;

public class EmployeeWageComputation {

	// Start with displaying welcome message
	public void printMessage() {
		System.out.println("Welcome to Employee Wage Computation");
	}

	public static void main(String[] args) {

		UC1_EmployeeAttendance call = new UC1_EmployeeAttendance();

		call.printMessage();
	}
}
