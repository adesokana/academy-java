package com.bptn.course.week2;


public class Employee {
    // Private instance variables
    private int salary;
    private int hoursPerDay;

    // Constructor to initialize salary and hoursPerDay
    public Employee(int salary, int hoursPerDay) {
        setSalary(salary);        // Calls setSalary method to set and modify the salary
        setHoursPerDay(hoursPerDay); // Calls setHoursPerDay method to modify the salary based on hours worked
    }

    // Method to set the salary
    public void setSalary(int salary) {
        if (salary < 500) {
            this.salary = salary + 10; // Increase salary by 10 if it's less than 500
        } else {
            this.salary = salary; // Keep salary unchanged if it's 500 or more
        }
    }

    // Method to set the hours worked per day and adjust salary
    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
        if (hoursPerDay > 6) {
            this.salary += 5; // Increase salary by 5 if hours worked per day is greater than 6
        }
    }

    // Method to get the current salary
    public int getSalary() {
        return this.salary;
    }
}

