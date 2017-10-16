package automorphic;

import java.util.Scanner;

public class AutomorphicByRemainder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = -1;
		do{
			System.out.println("Enter a positive number to check its automorphic: ");
			while(!scanner.hasNextInt()){
				System.out.println("Wrong input!!!. Input only positive number.");
				scanner.next();
			}
			inputValue = scanner.nextInt();
		} while(inputValue < 0);
		switch (inputValue) {
		case 0:
			System.out.println("0 is not Automorphic number.");
			break;
		default:
			//Find out, number of digits in a given input, below used String api to calculate, we can also find using division method on given input.
			int numberOfDigits = String.valueOf(inputValue).length();
			int square = (inputValue * inputValue);
			//Find out the last digits in a squared number by remainder method, ex 5 -> 25. 25 % 10 to the pow numberOfDigits -> 25 % 10 -> 5.
			int lastDigits = (int) ( square % Math.pow(10, numberOfDigits));
			if (lastDigits == inputValue)
				System.out.format("%d is a Automorphic number. Its Square is %d", inputValue, square);
			else
				System.out.format("%d is not a Automorphic number. Its Square is %d", inputValue, square);
		}
		scanner.close();
	}

}
