package com.bimbel.bulan1.week2;

import java.util.Scanner;

public class Tugas2 {

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


		
		if (bilangan1 > bilangan2 && bilangan1 > bilangan3 && bilangan1 > bilangan4 ){
			System.out.println("Bilangan 1 bilangan terbesar");
		}
		else if ( bilangan2 > bilangan1 && bilangan2 > bilangan4 && bilangan2 > bilangan3){
			System.out.println("Bilangan 2 bilangan besar");
		}
		else if ( bilangan3 > bilangan1 && bilangan3 > bilangan4 && bilangan3 > bilangan2){
			System.out.println("Bilangan  3 bilangan besar ");
		}
		else if (bilangan4 > bilangan3 && bilangan4 > bilangan2 && bilangan4 > bilangan1){
			System.out.println("Bilagan 4 adalah bilangan besar");
			}
		else {
			System.out.println("Bilangan sama");
		}
			
		}

}
