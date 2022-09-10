package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage Program!");
        final int fullTime = 1;
        final int partTime = 2;
        int wagePerHr = 20;
        int fullTimeHr = 16;
        int partTimeHr = 8;
        int monthlyWages = 0;
        for (int day = 1; day <= 20; day++) {
            double check = Math.floor(Math.random() * 10) % 3;
            int dailyWage = 0;
            switch ((int) check) {
                case fullTime:
                    System.out.println("Employee is Present Full Time");
                    dailyWage = fullTimeHr * wagePerHr;
                    break;
                case partTime:
                    System.out.println("Employee is Present Part Time");
                    dailyWage = partTimeHr * wagePerHr;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    break;
            }

            System.out.println("Daily Wage for Day=" + day + " is=" + dailyWage);
            monthlyWages += dailyWage;
            System.out.println();
        }
        System.out.println("Monthly Wages are: " + monthlyWages);

    }
}
