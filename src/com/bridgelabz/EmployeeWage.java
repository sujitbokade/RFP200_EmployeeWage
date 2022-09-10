package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage Program!");
        int fullTime = 1;
        int partTime = 2;
        int wagePerHr = 20;
        int fullTimeHr = 16;
        int partTimeHr = 8;
        double check = Math.floor(Math.random() * 10) % 3;
        int dailyWage = 0;
        if (check == fullTime) {
            System.out.println("Employee is Present Full Time");
            dailyWage = fullTimeHr * wagePerHr;
        } else if (check == partTime) {
            System.out.println("Employee is Present Part Time");
            dailyWage = partTimeHr * wagePerHr;
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("DailyWage is :" + dailyWage);
    }
}
