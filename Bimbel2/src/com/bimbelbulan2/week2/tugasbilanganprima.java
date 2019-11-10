package com.bimbelbulan2.week2;

public class tugasbilanganprima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		   
		  Scanner scanInt = new Scanner(System.in);
		  System.out.println("Silakan masukkan angka yang akan di cek: ");
		   
		  int angka = scanInt.nextInt();
		   
		  int temp;
		  boolean prima = true;
		   
		  //penggunaan for loop
		  for(int pembagi = 2; pembagi <= angka / 2; pembagi++){
		    
		   temp = angka % pembagi;
		    
		   if(temp == 0){
		     
		    prima = false;
		    break;
		     
		   }
		   
		  }
		   
		  /*
		   Jika prima adalah true dan angka yang diberikan user
		   bukanlah 0 dan 1
		   */
		  if(prima && ((angka > 0)&&(angka != 1)))
		   System.out.println(angka + " adalah bilangan prima");
		  else
		   System.out.println(angka + " bukanlah bilangan prima");
		   
		 }
		 
		

	}


