package com.bimbelbulan1.week2;

import java.util.Scanner;

public class tugas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Perbandingan 4 Bilangan 
		
		int bilangan1, bilangan2, bilangan3, bilangan4;
		Scanner scanint = new Scanner(System.in);
		
		System.out.println("Masukkan Bilangan 1: ");
		bilangan1 = scanint.nextInt();
		System.out.println("Masukkan Bilangan 2");
		bilangan2 = scanint.nextInt();
		System.out.println("Masukkan Bilangan 3");
		bilangan3 = scanint.nextInt ();
		System.out.println("Masukkan Bilangan 4");
		bilangan4 = scanint.nextInt ();


		
		if (bilangan1 > bilangan2 & bilangan1 > bilangan3 & bilangan1 > bilangan4 ){
			System.out.println("Bilangan terbesar adalah bilangan: " + bilangan1);
		}
		else if ( bilangan2 > bilangan1 & bilangan2 > bilangan4 & bilangan2 > bilangan3){
			System.out.println("Bilangan terbesar adalah bilagan:" + bilangan2);
		}
		else if ( bilangan3 > bilangan1 & bilangan3 > bilangan4 & bilangan3 > bilangan2){
			System.out.println("Bilangan terbesar adalah bilangan: " + bilangan3 );
		}
		else if (bilangan4 > bilangan3 & bilangan4 > bilangan2 && bilangan4 > bilangan1){
			System.out.println("Bilagan terbesar adalah bilangan: " + bilangan4 );
			}
		else {
			System.out.println("Semua Bilangan sama");
		
			
		}
	}
}


