package com.bimbelbulan1.week3;

import java.util.Scanner;

public class tugasLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, bilangan, max, a ;
		System.out.print("Masukkan jumlah bilangan yang akan anda bandingkan: " );
		Scanner scanInt = new Scanner(System.in);
		a = scanInt.nextInt();
		System.out.print ("Masukkan Bilangan ke 1: " );
		bilangan = scanInt.nextInt();
		max = bilangan;
		i = 1;
	

		
		while (i < a){
			System.out.print ("Masukkan Bilangan ke " +  (i+1) + ": " );
			bilangan = scanInt.nextInt();
			if (bilangan > max ) {
				max = bilangan;
			}
			
			i++;
		} 
		System.out.println("Bilangan Terbesar adalah: " + max);
				

	}

}


