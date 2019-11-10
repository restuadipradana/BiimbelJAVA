package com.bimbel.bulan1.week1;

import java.util.Scanner;

public class lat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname, lname, name, quest, i;
		quest = "y";
		Scanner scanString = new Scanner(System.in);
		while(quest=="y"){
			
			System.out.print("enter first name= ");
			fname = scanString.next();
			System.out.print("enter last name= ");
			lname = scanString.next();
			name = fname+lname;
			System.out.println("U'r name is " + fname + " "+ lname+" ");
			System.out.println("Your username" +name);
			System.out.println("Mau nanya lagi? (y/n) ");
			i = scanString.next();
			quest = i;
		}

	}

}
