package com.bimbelbulan2.week2;

import java.util.Scanner;

public class TestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bil;
		Scanner scanInt = new Scanner(System.in);
		System.out.println("Enter Number: ");
		bil = scanInt.nextInt();
		
//		Mynumberr mynumber = new Mynumberr ();
//		mynumber.isEventNonStatic(bil);
//		mynumber.isOddNonStatic(bil);
		
//		mynumber.isEven(bil);
//		mynumber.isOdd(bil);
		
		if (mynumber.isEvenTo(bil)){
			System.out.println(bil + "that is number of even");
		}else{
			System.out.println(bil + "that isn't number of even ");
		}
		
		if (mynumber.isOddTo(bil)){
			System.out.println(bil + "that is number of Odd");
		}else{
			System.out.println(bil + "that isn't number of Odd");
		}
		
		MyNumberr mynumber = new Mynumber

	}

}
