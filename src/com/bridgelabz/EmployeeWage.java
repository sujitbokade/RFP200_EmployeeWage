package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage Program!");
        int present = 1;
        double check = Math.floor(Math.random() * 10) % 2;
        if (check == present) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
