package com.EmployeeDetails;
public class EmployeePartTimeWage {
    public static void main(String[] args) {
        int Full_time = 1;
        int Working_hour = 0;
        int Wage_perhour = 20;
        int Daily_wage = 0;
        double employee_check = Math.floor(Math.random() * 10) % 2;
        if (employee_check == Full_time){
            Working_hour = 16;
            System.out.println("Employee worked for full_time");
        }else{
            Working_hour = 8;
            System.out.println("Employee worked as a part_timer");
        }
        Daily_wage = Wage_perhour * Working_hour;
        System.out.println("Daily_wage of Employee is :" + Daily_wage);
    }
}
