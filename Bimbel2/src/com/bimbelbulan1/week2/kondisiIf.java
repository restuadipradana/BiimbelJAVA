package com.bimbelbulan1.week2;

import java.util.Scanner;

public class kondisiIf {
	
	private static Scanner scanString;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstString, secondString;
		System.out.println("Enter First String: ");
		scanString = new Scanner(System.in);
		firstString = scanString.nextLine();
		System.out.println("Enter Second String: ");
		secondString = scanString.nextLine();
		if (firstString.compareTo(secondString) > 0){
			System.out.println(firstString + " is greater then " + secondString);
		}
		else if (firstString.compareTo(secondString) < 0) {
			System.out.println(firstString + " is smaller then " + secondString);
		}
		else{
			System.out.println("is equal");
		}

	}

}
