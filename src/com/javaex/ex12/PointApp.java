package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4,4);
		
		System.out.println("========================");
		
		ColorPoint cp1 = new ColorPoint("red");
		
		System.out.println("========================");
		
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		
		/*p.showInfo();*/

	    cp1.showInfo();
	    
	   // cp2.showInfo();
	}

}
