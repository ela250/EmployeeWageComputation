package com.EmployeeDetails;
public class EmployeeDailywage {
    public static void main(String[] args) {
        int Fulltime = 0;
        int Wage_perhour = 20;
        int Working_hour = 0;
        int Daily_wage = 0;
        double employee_check = Math.floor(Math.random() * 10) % 2;
        if(employee_check == Fulltime){
            Working_hour = 8;
        }else{
            Working_hour = 0;
            System.out.println("Employee is absent");
        }
        Daily_wage = Working_hour * Wage_perhour;
        System.out.println("Employee Daily wage is :" + Daily_wage);
    }
}
