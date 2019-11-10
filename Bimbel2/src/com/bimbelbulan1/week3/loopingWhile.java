package com.bimbelbulan1.week3;

import java.util.Scanner;

public class loopingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, bilangan, max;
		System.out.print("Masukkan Bilangan ");
		Scanner scanInt = new Scanner(System.in);
		bilangan = scanInt.nextInt();
		max = bilangan;
		i = 1;
		while (i < 4){
			System.out.print ("Masukkan Bilangan " );
			bilangan = scanInt.nextInt();
			if (bilangan > max ) {
				max = bilangan;
			}
			
			i++;
		} 
		System.out.println("Bilangan Terbesar adalah " + max);
				

	}

}
