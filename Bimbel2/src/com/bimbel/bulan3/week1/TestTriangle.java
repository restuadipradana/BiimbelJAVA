package com.bimbel.bulan3.week1;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double side1, side2, side3;
		Scanner scanDouble = new Scanner(System.in);
		System.out.print("Enter First Side: ");
		side1 = scanDouble.nextDouble();
		System.out.print("Enter Second Side:");
		side2 = scanDouble.nextDouble();
		System.out.print("Enter Third Side:");
		side3 = scanDouble.nextDouble();
		boolean triangle = Triangle.isValid(side1, side2, side3);
		if (triangle){
			double area = Triangle.area(side1, side2, side3);
			System.out.println("That is a Triangle");
			System.out.println("And the area is " + Triangle.area(side1, side2, side3));
		}else{
			System.out.println("That isn't a Triangle");
		}
		scanDouble.close();

	}

}
