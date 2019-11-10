package lastweek;
import java.util.Scanner;

public class anag {

	public static void main(String[] args) {
		String input1, input2;
		
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter First String : ");
        input1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        input2 = scan.nextLine();
		
        anagmtd.isMyAnagram(input1, input2);
		

	}

}
