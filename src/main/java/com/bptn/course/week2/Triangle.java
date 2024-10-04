package com.bptn.course.week2;

public class Triangle {

    // Method to calculate the perimeter of the triangle
    public int perimeterCalculator(int a, int b, int c) {
        return a + b + c; // Perimeter = sum of the three sides
    }

    // Method to calculate the area of the triangle
    public int areaCalculator(int base, int height) {
        return (base * height) / 2; // Area = (base * height) / 2
    }

    // Do not modify the code below:
    public static void main (String[] args) {

        Triangle object = new Triangle();

        int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.perimeterCalculator(a, b, c);
        int area = object.areaCalculator(7, 10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
    }
}