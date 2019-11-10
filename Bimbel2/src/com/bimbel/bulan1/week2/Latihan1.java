package com.bimbel.bulan1.week2;

import java.util.Scanner;

public class Latihan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int bilangan1, bilangan2 ;
		
		Scanner scanInt = new Scanner(System.in);
		System.out.print("Masukkan Bilangann pertama=");
		bilangan1 = scanInt.nextInt();
		System.out.println("Masukkan Bilangan Kedua=");
		bilangan2 = scanInt.nextInt();
		if(bilangan1 > bilangan2){
			System.out.println("Bilangan terbesar adalah" + bilangan1);
		}else{
			System.out.println("Bilangan Terbesar Adalah " + bilangan2);
		} 
	}

}
