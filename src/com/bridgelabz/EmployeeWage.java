package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage Program!");
        int present = 1;
        int wagePerHr = 20;
        int fullDayHr = 8;
        double check = Math.floor(Math.random() * 10) % 2;
        int dailyWage = 0;
        if (check == present) {
            System.out.println("Employee is Present");
             dailyWage = fullDayHr * wagePerHr;
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("DailyWage is :"+dailyWage);
    }
}
