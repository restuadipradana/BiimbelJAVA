package com.bimbel.bulan1.week1;
import java.util.Scanner;
public class MyTringleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double side1, side2, side3;
		Scanner scanDouble = new Scanner(System.in);
		System.out.print("Sisi pertama: ");
		side1 = scanDouble.nextDouble();
		System.out.print("Sisi kedua: ");
		side2 = scanDouble.nextDouble();
		System.out.print("Sisi ketiga: ");
		side3 = scanDouble.nextDouble();
		boolean triangle = MyTriangleFormula.isValid(side1, side2, side3);
		if (triangle){
			double area = MyTriangleFormula.area(side1, side2, side3);
			System.out.println("Itulah Segitia");
			System.out.println("Area nya " + MyTriangleFormula.area(side1, side2, side3));
		}else{
			System.out.println("Itu bukan segitiga");
		}
		scanDouble.close();

	}

}
