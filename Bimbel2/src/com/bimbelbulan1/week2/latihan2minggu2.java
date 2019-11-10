package com.bimbelbulan1.week2;

import java.util.Scanner;

public class latihan2minggu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String namaDepan, namaBelakang;
		
		Scanner scanString = new Scanner (System.in);
		System.out.print("Masukkan Nama Depan Anda? ");
		namaDepan= scanString.nextLine();
		System.out.print("Masukkan Nama Belakang Anda? ");
		namaBelakang = scanString.nextLine();
		System.out.print("Nama Lengkap Anda=  " + namaDepan+ " "+ namaBelakang);
				

	}

}
