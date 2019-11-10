package com.bimbel.bulan1.week2;

import java.util.Scanner;

public class Tugas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int bilangan1, bilangan2, bilangan3 ;
		
		Scanner scanInt = new Scanner(System.in);
		System.out.print("Masukkan Bilangann pertama=");
		bilangan1 = scanInt.nextInt();
		System.out.println("Masukkan Bilangan Kedua=");
		bilangan2 = scanInt.nextInt();
		System.out.println("Masukkan Bilangan Ketiga=");
		bilangan3 = scanInt.nextInt();
		
		if (bilangan1 > bilangan2 && bilangan1 > bilangan3){
		System.out.println("Bilangan Terbesar Adalah" +  bilangan1);
	}else if (bilangan2 > bilangan1 && bilangan2 > bilangan3){
		System.out.println("Bilangan Terbesar Adalah" + bilangan2);
	}
	else if (bilangan3 > bilangan1 && bilangan3 > bilangan2){
		System.out.println("Bilangan Terbesar Adlah" +bilangan3);
	}else{
		System.out.println("Semua Bilangan Sama");
	}
	}

}
