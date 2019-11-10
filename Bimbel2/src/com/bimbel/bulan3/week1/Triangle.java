package com.bimbel.bulan3.week1;

import java.util.Scanner;

public class Triangle {
	public static boolean isValid (double side1, double side2, double side3){
		if (side1 + side2> side3 && side1 + side3 > side2 && side2 + side3 > side1){
			return true;
		}else{
			return false;
		}
		}
	public static double area (double side1, double side2, double side3){
		double area;
		double s = (side1+side2+side3)/2;
		area = Math.sqrt(s*((s-side1)* (s-side2)* (s-side3)));
		
		return area;
		
			}
}
