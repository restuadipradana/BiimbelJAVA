package com.bimbelbulan1.week4;

import java.util.Scanner;

public class TugasLoopingBenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String yesNo = "y";
		Scanner scanInt = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		while (yesNo.equalsIgnoreCase("y")){ 
			int i, jumBilangan, bilangan, max;
			int urutan = 1;
			System.out.print("Masukkan jumlah bilangan yang akan anda bandingkan:");
			jumBilangan = scanInt.nextInt();
			System.out.print("Masukan Bilangan Ke 1: ");
			bilangan = scanInt.nextInt();
			max = bilangan;
			i = 1;
			while(i < jumBilangan){
				System.out.print( "Masukkan Bilangan ke " + (i+1)+ ":");
				bilangan = scanInt.nextInt();
				if (bilangan > max){
					max = bilangan;
					urutan = i + 1;
				}
				i++;
			}
			System.out.println(" Bilangan terbesar adalah bilangan ke " +urutan + " dengan" + " bilangan: " + max);
			System.out.print("Apakah anda ingin mengulang (Y/N)?");
			yesNo = scanStr.next();
			System.out.println();
		}
scanInt.close();
scanInt.close();
	}

}
