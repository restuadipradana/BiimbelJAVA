package com.bimbel.bulan1.week1;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String namaDepan, namaBelakang, namaLengkap;
		
		Scanner scanString = new Scanner(System.in);
		System.out.print("Masukkan nam depan=");
		namaDepan = scanString.next();
		System.out.println("Masukkan nama belakang=");
		namaBelakang = scanString.next();
		namaLengkap = namaDepan+namaBelakang;
		System.out.println("Nama Lengkap Adalah " + namaDepan + " " + namaBelakang +"");

	}

}
