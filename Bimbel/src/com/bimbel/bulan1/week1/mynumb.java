package com.bimbel.bulan1.week1;

public class mynumb {

	public void isEventNonStatic(int number){
		if(number % 2 == 0){
		System.out.println(number + " that is number of even");
		}else{
			System.out.println(number + " that isn't number of even");
		}	
	}
	
	public void isOddNonStatic(int number){
		if(number % 2 != 0){
		System.out.println(number + " that is number of odd");
		}else{
			System.out.println(number + " that isn't number of odd");
		}	
	}
	
	public void isEven(int number){
		if(number % 2 == 0){
		System.out.println(number + " that is number of even");
		}else{
			System.out.println(number + " that isn't number of even");
		}	
	}
	
	public void isOdd(int number){
		if(number % 2 != 0){
		System.out.println(number + " that is number of odd");
		}else{
			System.out.println(number + " that isn't number of odd");
		}	
	}
	
	public static boolean isEvenTo(int number){
		if (number %2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isOddTo(int number){
		if (number %2 != 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isEvenToNonStatic(int number){
		if (number %2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isOddToNonStatic(int number){
		if (number %2 != 0){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
}
