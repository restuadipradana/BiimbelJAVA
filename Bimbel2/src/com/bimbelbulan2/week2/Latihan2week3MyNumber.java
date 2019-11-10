package com.bimbelbulan2.week2;

import java.util.Scanner;

public class Latihan2week3MyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bil;
		Scanner scanInt = new Scanner(System.in);
		System.out.println("Enter Number");
		bil = scanInt.nextInt();
				
				// Latihan1week2mynumber mynumber = new Latihan1week2mynumber();
				// mynumber.isEvenNonStatic(bil);
				// mynumber.isOddNonStatic(bil);
		
		latihan1week2mynumber.isEven(bil);
		latihan1week2mynumber.isOdd(bil);
//		
//		if (latihan1week2mynumber.isEvenTo(bil) == true){
//			System.out.println(bil + " that is number of even");
//		} else {
//			System.out.println(bil + " that isn't number of even");
//		}
//		
//		if (latihan1week2mynumber.isOddTo (bil)){
//			System.out.println(bil + " that is number of even");
//		}else{
//			System.out.println(bil + " that isn't number of even");
//		}
//		
	latihan1week2mynumber myNumber = new latihan1week2mynumber();
		
		if(myNumber.isEvenToNonStatic(bil)){
			System.out.println( bil + "that is number of even");
		}else{
			System.out.println(bil + "that isn't number of even");
		}
				
				
		if(myNumber.isOddToNonStatic(bil)){
			System.out.println(bil + " that is number of even ");
		}else{
			System.out.println(bil + " that isn't a number of even");
	
		
		boolean isEven = myNumber.isEvenToNonStatic(bil);
		if (isEven){
			System.out.println( bil + "that is number of even");
		}else{
			System.out.println(bil + "that isn't number of even");
		}
		
		boolean isOdd = myNumber.isOddToNonStatic (bil);
		if (isOdd){
			System.out.println(bil + " that is number of Odd");
		}else{
			System.out.println(bil );
		}
		
		boolean isPrime = myNumber.isPrime(bil);
		if(isPrime){
			System.out.println(bil + "that is number of Prime " );
		}else{
			System.out.println(bil + "that isn't number of prime" );
		}
		if (latihan1week2mynumber.isPrime(bil)){
			System.out.println(bil + "that is number of prime");
		}else{
			System.out.println(bil + "that isn't number of prime");
		}
		
//		latihan1week2mynumber.numberToPrint(bil);
//		String primeNumber = "";
//		for (int i =2; i < bil; i++){
//			if (latihan1week2mynumber.isPrime(i){
//				if (primeNumber.equals("")){
//					primeNumber = primeNumber.concat(String.valueOf(i));
//				}else{
//					primeNumber = primeNumber.concat(", ");
//					primeNumber = primeNumber.concat(String.valurOf(i));
//				}
//				
//			}
//		}
//		System.out.println();
//		
		}

	}
}


