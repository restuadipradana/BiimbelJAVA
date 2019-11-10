package com.bimbel.readfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class employeecontroller {

	public static List<employeemodel> getListEmployee(String fileName) {
		List<String> list = new ArrayList<String>();
		List<employeemodel> listEmp = new ArrayList<employeemodel>();
		
		Scanner scan = new Scanner(System.in);
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = bufferedReader.readLine() ) != null){
				list.add(line);
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 1; i < list.size(); i++){
			employeemodel employeeModel = new employeemodel();
			scan = new Scanner(list.get(i)).useDelimiter(";");
			employeeModel.setEmpId(Integer.parseInt(scan.next()));
			employeeModel.setEmployee(scan.next());
			employeeModel.setGender(scan.next());
			try{
				employeeModel.setBirthdate(sdf.parse(scan.next()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			employeeModel.setAddress(scan.next());
			employeeModel.setCity(scan.next());
			listEmp.add(employeeModel);
			
			
		}
		return listEmp;
		
		
	}
	public static void pListEmployee(String fileName, String tanggal, int noid, String nama , String jk , String alamat , String kota)  {

		Scanner scanner = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		try {
			List <employeemodel> listEmp = employeecontroller.getListEmployee(fileName);
			SimpleDateFormat sdfe = new SimpleDateFormat("yyyy-MM-dd");
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write("EMP_ID; EMP_NAME; GENDER; BIRTHDATE; ADDRESS; CITY \n");
			for (int i = 0; i < listEmp.size(); i++) {
				employeemodel employeeModel = (employeemodel)listEmp.get(i);
				writer.write(  employeeModel.getEmpId() +";"+ employeeModel.getEmployee() +";"+ employeeModel.getGender() +";"+ sdfe.format(employeeModel.getBirthdate()) +";"+ employeeModel.getAddress() +";"+ employeeModel.getCity() + "\n");
			}
				
			noid = listEmp.size() + 1;
			writer.write( noid + ";" + nama+";"+jk+";"+tanggal+";"+alamat+";"+kota);
			writer.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	//	return pListEmployee();
	}
	
	
}
