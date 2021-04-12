package com.epam.test.automation.java.practice5;

public class ArrayRectangles {
    private Rectangle[] rectangleArray;
	private int count;
	
	public ArrayRectangles(int n) {
		rectangleArray = new Rectangle[n];
		count = 0;
	}
	public ArrayRectangles(Rectangle ... rectangles) {
		rectangleArray = rectangles;
	}
   
    public boolean addRectangle(Rectangle rectangle) {
        if (count<rectangleArray.length) {
			rectangleArray[count] = rectangle;
			count++;
			return true;
		}
		return false;
    }

    public int numberMaxArea() {
        double maxArea = 0;
        int index = 0;
    	for (int i = 0; i<rectangleArray.length; i++) {
    		if (rectangleArray[i].area() > maxArea) {
    			index = i;
    			maxArea = rectangleArray[i].area();
    		}
    	}
        return index;
    }
   
    public int numberMinPerimeter() {
        double minPerimeter = rectangleArray[0].perimeter();
        int index = 0;
    	for (int i = 0; i<rectangleArray.length; i++) {
    		if (rectangleArray[i].area() < minPerimeter) {
    			index = i;
    			minPerimeter = rectangleArray[i].perimeter();
    		}
    	}
        return index;
    }

    public int numberSquares() {
    	int amount = 0;
    	for (Rectangle rectangle : rectangleArray) {
			if (rectangle.isSquare()) amount++; 
		}
        return amount;
    }

}
