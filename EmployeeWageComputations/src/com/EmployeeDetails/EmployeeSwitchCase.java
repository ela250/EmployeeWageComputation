package com.EmployeeDetails;
public class EmployeeSwitchCase {
    static final int Full_time = 1;
    static final int Part_time = 0;
    public static void main(String[] args) {
        int Working_hour = 0;
        int Wage_perhour = 20;
        int Daily_wage = 0;
        double employee_check = Math.floor(Math.random() * 10) % 3;
        switch ((int)employee_check) {
            case Full_time :
                Working_hour = 16;
                System.out.println("Employee worked for fulltime :)");
                break;
            case Part_time :
                Working_hour = 8;
                System.out.println("Employee worked as a part_timer :)");
                break;
            default :
                Working_hour = 0;
                System.out.println("Employee is Absent");
        }
        Daily_wage = Working_hour * Wage_perhour;
        System.out.println("Dailywage of employee is :" + Daily_wage);
    }
}