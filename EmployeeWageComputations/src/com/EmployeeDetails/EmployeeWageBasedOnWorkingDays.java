package com.EmployeeDetails;

public class EmployeeWageBasedOnWorkingDays {
    static final int Working_days_per_month = 20;
    static final int Total_working_hours = 100;

    public static void main(String[] args) {
        int Full_time = 1;
        int Part_time = 2;
        int Wage_perhour = 20;
        int Daily_wage = 0;
        int Monthly_wage = 0;
        int Working_hour = 0;
        double employee_check = Math.floor(Math.random() * 10) % 3;
        for (int day = 0; day < Working_days_per_month; day++) {
            for (int hour = 0; hour <= Total_working_hours; hour++) {
                if (employee_check == Full_time) {
                    Working_hour = 16;
                } else if (employee_check == Part_time){
                    Working_hour = 8;
                }else{
                    Working_hour = 0;
                }
                Daily_wage = Working_hour * Wage_perhour;
                Monthly_wage = Daily_wage + Monthly_wage;
            }
        }
        System.out.println("Employee monthly wage is : " + Monthly_wage);
    }
}
