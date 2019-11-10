package com.bimbelbulan2.week2;

public class Mynumberr {

	public void isEvenNonStatic (int number){
		if (number %2 ==0){
			System.out.println(number + "that is number of even");
		}else{
			System.out.println(number + "that isn't number of evenn");
		}

	}
	public void isOddNonStatic(int number){
		if (number %2 != 0){
			System.out.println(number + "that is number of Odd");
		}else{
			System.out.println(number + "that isn't number of Odd");
		}
	}
}