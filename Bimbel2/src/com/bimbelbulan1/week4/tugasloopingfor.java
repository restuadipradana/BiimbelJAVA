package com.bimbelbulan1.week4;

import java.util.Scanner;

public class tugasloopingfor {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, bilangan, max;
		Scanner scanInt = new Scanner(System.in);
		bilangan = scanInt.nextInt();
		max = bilangan;
		i = 1;
		
		for (i = 1; i<9; i++){
			bilangan = scanInt.nextInt();
			if(bilangan > max){
				max = bilangan;
			}
		}
		System.out.println("Bilangan Terbesar adalah: " + max);

	}

}
