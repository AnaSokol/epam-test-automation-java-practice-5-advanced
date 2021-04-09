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
        rectangleArray[count] = rectangle;
		count++;
		return true; 
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
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

    public int numberSquares() {
        //TODO: Delete line below and write your own solution;
        throw new UnsupportedOperationException();
    }

}
