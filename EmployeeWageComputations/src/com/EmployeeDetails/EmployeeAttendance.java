package com.EmployeeDetails;
public class EmployeeAttendance {
    public static void main(String[] args) {
        int Full_time = 0;
        double employee_check = Math.floor(Math.random() * 10) % 2;
        if (employee_check == Full_time) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
