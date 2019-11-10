package com.bimbel.readfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class readData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "";
		String nama, jk, alamat, kota, tanggal;
		int noid = 0;
		Scanner scanner = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		System.out.print("Enter Path File Name: ");
		fileName = scanner.nextLine();
		System.out.print("Enter Employee Name: ");
		nama = scanner.nextLine();
		System.out.print("Enter Employee Gender (M/F): ");
		jk = scanner.nextLine();
		System.out.print("Enter Birthdate (yyyy-MM-dd) : ");
		tanggal = scanInt.nextLine();
		System.out.print("Enter Employee Address: ");
		alamat = scanner.nextLine();
		System.out.print("Enter Employee City: ");
		kota = scanner.nextLine();
		employeecontroller.pListEmployee(fileName, tanggal, noid, nama, jk, alamat, kota);
		if (fileName.equals("")){
			System.out.println("File Name ga boleh kosong!");
		} else {
			
			
			List <employeemodel> listEmp = employeecontroller.getListEmployee(fileName);
			SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
			for (int i = 0; i < listEmp.size(); i++) {
				employeemodel employeeModel = (employeemodel)listEmp.get(i);
				System.out.println((i+1) + ".\t" + "Employee ID\t: " + employeeModel.getEmpId());
				System.out.println("\t" + "Employee Name\t: " + employeeModel.getEmployee());
				System.out.println("\t" + "Gender\t\t: " + employeeModel.getGender());
				System.out.println("\t" + "Birthdate\t: " + sdf.format(employeeModel.getBirthdate()));
				System.out.println("\t" + "Address\t\t: " + employeeModel.getAddress());
				System.out.println("\t" + "City\t\t: " + employeeModel.getCity() + "\n");
			}
			
			
		}
		scanner.close();

	}

}
