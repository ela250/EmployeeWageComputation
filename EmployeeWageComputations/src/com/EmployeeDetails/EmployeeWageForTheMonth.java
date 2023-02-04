package com.EmployeeDetails;
public class EmployeeWageForTheMonth {
    static final int Working_days_per_month = 20;
    public static void main(String[] args) {
        int Full_time = 1;
        int Wage_perhour = 20;
        int Daily_wage = 0;
        int Monthly_wage = 0;
        int Working_hour = 0;
        double employee_check = Math.floor(Math.random() * 10) % 2;
        for (int day = 0; day < Working_days_per_month; day++) {
            if (employee_check == Full_time){
                Working_hour = 16;
            }else{
                Working_hour = 8;
            }
            Daily_wage = Working_hour * Wage_perhour;
            Monthly_wage = Daily_wage + Monthly_wage;
        }
        System.out.println("Employee monthly wage is : " + Monthly_wage);
    }

}
