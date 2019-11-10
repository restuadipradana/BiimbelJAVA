package com.bimbelbulan1.week3;

import java.util.Scanner;

public class loopingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, bilangan, max;
		Scanner scanInt = new Scanner(System.in);
		bilangan = scanInt.nextInt();
		max = bilangan;
		i = 1;
		do{
			bilangan = scanInt.nextInt();
			if (bilangan > max) {
				max = bilangan;
			}
			i++;
		} while (i<4);
		System.out.println(" Bilangan terbesar adalah: " + max);
		}

	}

