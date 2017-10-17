package harshad.or.niven;

import java.util.Scanner;

public class HarshadEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = -1;
		do{
			System.out.println("Input a positive value to check whether its a Harshad Or Niven Number: ");
			while(!scanner.hasNextInt()){
				System.out.println("Please input only positive number.");
				scanner.next();
			}
			inputValue = scanner.nextInt();
		}while(inputValue < 0);
		scanner.close();
		
		int sumOfDigits = 0;
		//Finding out the sum of digits of given input.
		/* I guess this metod will be more efficient.
		 	int tempNumber = inputValue;
		 	while(tempNumber != 0){
			int rem = tempNumber % 10;
			sumOfDigits += rem;
			tempNumber = tempNumber / 10;
		}*/
		
		// by converting characters and finding the sum. 
		char[] charArry = String.valueOf(inputValue).toCharArray();
		for(char digit : charArry){
			//Subtracting ASCII value of '0' to convert it as '5' to 5.
			sumOfDigits += Integer.valueOf(digit) - Integer.valueOf('0');
		}
		
		//if sum of digits is divisible on input value, then its a harshad or niven number else not.
		if(inputValue != 0 && inputValue % sumOfDigits == 0){
			System.out.format("%d is a harshad number. Its sum of digits is %d.", inputValue, sumOfDigits);
		} else 
			System.out.format("%d is not a harshad number. Its sum of digits is %d.", inputValue, sumOfDigits);
	}
}
