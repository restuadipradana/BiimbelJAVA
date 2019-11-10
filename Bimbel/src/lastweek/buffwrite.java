package lastweek;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class buffwrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));

			
			writer.write("Nama				: kiki \n");			
			writer.write("Program Studi		: Sistem Komputer \n");
			writer.write("NIM					: 1733499446\n");
			writer.write("No. HP				: 087778515668 \n");
			writer.write("Email				: restu.adi@raharja.info\n");
			writer.write("--------------------------------------- \n");
			writer.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
