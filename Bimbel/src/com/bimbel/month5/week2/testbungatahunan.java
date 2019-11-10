package com.bimbel.month5.week2;
import java.util.Scanner;
public class testbungatahunan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syariaaaaaah
		double amount, rate, fivc, fivs, fiv;
		int years;
		String yesno = "y";
		Scanner scanStr = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		Scanner scanDouble = new Scanner(System.in);
		Scanner scanYears = new Scanner(System.in);
		
		while (yesno.equalsIgnoreCase("y")) {
			System.out.print("Enter amount: ");
			amount = scanDouble.nextDouble();
			System.out.print("Enter rate: ");
			rate = scanDouble.nextDouble();
			System.out.print("Enter years: ");
			years = scanYears.nextInt();
			
			
			System.out.println("=====================================================");
			System.out.println("Tabungan Syariah		Tabungan Konvensional");
			System.out.println("Tahun	Future Investment  	Future Investment");
			System.out.println("=====================================================");
			double cnv = amount;
			
			for (int thn = 1; thn <= years; thn++) {
			
				fivc = bungatahunan.futureInvestmentValue(cnv, rate, thn);
				fivs = bungatahunan.futureInvestmentValue(amount, rate, thn);
				cnv = fivc;
				System.out.println(thn + "	" + fivs + "	" + cnv);
				
		    
			}
			System.out.println("Apakah anda ingin mengulang (Y/N) ");
			yesno = scanStr.next();
			System.out.println();
			
			//just loop
	//		System.out.println("=====================================================");
	//		System.out.println("Tahun	FIV  	");
	//		System.out.println("=====================================================");
	//		for (int thn = 1; thn <= years; thn++) {
	//			
	//			fiv = bungatahunan.futureInvestmentValue(amount, rate, thn);
	//			
	//			System.out.println(thn + "	" + fiv);
	//			
	//	    
	//		}
			
			
			//fiv = bungatahunan.futureInvestmentValue(amount, rate, years);
			//System.out.print("Future Investmen Value: " + fiv);
			
		}
		scanInt.close();
		scanInt.close();

	}



}
