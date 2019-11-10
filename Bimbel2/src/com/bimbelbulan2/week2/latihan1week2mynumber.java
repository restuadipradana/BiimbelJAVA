package com.bimbelbulan2.week2;

import java.util.Scanner;

public class latihan1week2mynumber {
	public void isEvenNonStatic (int number){
		if (number %2 ==0){
			System.out.println(number + " that is number of even");
		}else{
			System.out.println(number + " that is'nt number of even");
		}
	}
public void isOddNonStatic (int number){
	 if (number %2!=0){
		 System.out.println(number + " that is number of odd");
	 }else{
		 System.out.println(number + " that isn't number of odd");
	 }
}

public static void isEven (int number){
	if (number %2==0){
		System.out.println(number + " that is number of even");
	}else{
		System.out.println(number + " that is isn't number of even");
	}
}
public static void isOdd (int number){
	if (number %2!=0){
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
	if(number %2 != 0){
		return true;
	}else{
		return false;
	}
}
public boolean isEvenToNonStatic (int number){
	if (number %2 == 0){
		return true;
	}else{
		return false;
	}
}

public boolean isOddToNonStatic(int number){
	if (number %2 != 0){
		return true;
	}else{
		return false;
	}
}
public static boolean isPrime(int number){
	if (number ==2){
		return true;
	}else if(number <= 0){
		return false;
	}else{
		for (int i=2; i<number; i+=2){
			if (number %i ==0){
				return false;
			}else{
				for (int j=3; j<number; j+=2){
					if (number%j == 0){
						return false;
					}
				}
			}
		}
	}
	return true;
}
}
