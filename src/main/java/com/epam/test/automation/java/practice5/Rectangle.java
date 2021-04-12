package com.epam.test.automation.java.practice5;

public class Rectangle {
    private double sideA;
	private double sideB;

    public Rectangle(double a, double b) {
        if (a > 0 && b > 0) { 
			sideA = a;		
		    sideB = b;
		}
		else
			throw new IllegalArgumentException();
    }

    public Rectangle(double a) {
        this(a, 5);
    }

    public Rectangle() {
        this(4, 3);
    }
   
    public double getSideA() {
        return sideA;
    }
   
    public double getSideB() {
        return sideB;
    }

    public double area() {
        return sideA*sideB;
    }
    
    public double perimeter() {
        return 2*(sideA+sideB);
    }

    public boolean isSquare() {
		return sideA == sideB;
    }

    public void replaceSides() {
       double temp = sideA;
        sideA = sideB;
        sideB = temp;
    }

}
