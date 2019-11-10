package com.bimbelbulan4.week1;

public class methodRangee {

	public static void numberToPrint(int number) {
		String numEven = "";
		String numOdd = "";
		for (int i=1; i<number; i++){
			//logic for even number
			if (i %2 == 0){
				if (numEven.equals("")){
					numEven = numEven.concat(String.valueOf(i));
				}else{
					numEven = numEven.concat(", ");
					numEven = numEven.concat(String.valueOf(i));
				}
			}else{
				//logic for odd number
				if (numOdd.equals("")){
					numOdd = numOdd.concat(String.valueOf(i));
				}else{
					numOdd = numOdd.concat(",");
					numOdd = numOdd.concat(String.valueOf(i));
				}
			}
		}
		System.out.println("Even Number Range ".concat(String.valueOf(number)).concat("is: ").concat(numEven));
		System.out.println("Odd Number Range". concat(String.valueOf(number)).concat(" is: ").concat(numOdd));
		// TODO Auto-generated method stub

	}

}
