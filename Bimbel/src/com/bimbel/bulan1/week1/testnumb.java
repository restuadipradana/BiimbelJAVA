package com.bimbel.bulan1.week1;

import java.util.Scanner;

public class testnumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bil;
		Scanner scanInt = new Scanner(System.in);
		System.out.print("Masukan angka: " );
		bil = scanInt.nextInt();
		
	//	MyNumber myNumber = new MyNumber();
	//	myNumber.isEventNonStatic(bil);
	//	myNumber.isOddNonStatic(bil);
		
		
	//	MyNumber.isEven(bil);
	//	MyNumber.isOdd(bil);
		
		
		
//		if (MyNumber.isEvenTo(bil)){
//			System.out.println(bil + " that is number of even");
//		}else {
//			System.out.println(bil + " that isn't number of even");
//		}
//		
//		if (MyNumber.isOddTo(bil)){
//			System.out.println(bil + " that is number of odd");
//		}else {
//			System.out.println(bil + " that isn't number of odd");
//		}
		
		
		
//		boolean isEven = MyNumber.isEvenTo(bil);
//		if (isEven){
//			System.out.println(bil + " that is number of even");
//		}else {
//			System.out.println(bil + " that isn't number of even");
//		}
//		
//		boolean isOdd = MyNumber.isOddTo(bil);
//		if (isOdd){
//			System.out.println(bil + " that is number of odd");
//		}else {
//			System.out.println(bil + " that isn't number of odd");
//		}
	
		
		
		
		MyNumber myNumber = new MyNumber();
//		if (myNumber.isEvenToNonStatic(bil)){
//			System.out.println(bil + " that is number of even");
//		}else {
//			System.out.println(bil + " that isn't number of even");
//		}
//		
//		if (MyNumber.isOddToNonStatic(bil)){
//			System.out.println(bil + " that is number of odd");
//		}else {
//			System.out.println(bil + " that isn't number of odd");
//		}
		
		boolean isEven = myNumber.isEvenToNonStatic(bil);
		if (isEven){
			System.out.println(bil + " that is number of even");
		}else {
			System.out.println(bil + " that isn't number of even");
		}
		
		boolean isOdd = myNumber.isOddToNonStatic(bil);
		if (isOdd){
			System.out.println(bil + " that is number of odd");
		}else {
			System.out.println(bil + " that isn't number of odd");
		}
		
	
	
	
	}

}
