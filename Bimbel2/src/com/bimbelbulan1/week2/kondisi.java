package com.bimbelbulan1.week2;

import java.util.Scanner;

public class kondisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bilangan1, bilangan2;
		Scanner scanInt = new Scanner(System.in);
		System.out.println("Masukkan bilangan pertama: ");
		bilangan1 = scanInt.nextInt();
		System.out.println(" Masukkan bilangan kedua: ");
		bilangan2 = scanInt.nextInt();
		if (bilangan1 > bilangan2){
			System.out.println("Bilangan Terbesar adalah: " + bilangan1);
		}else{
			System.out.println(" Bilangan Tersebar adalah: " + bilangan2);
		}
		scanInt.close();

	}
                                           
}
