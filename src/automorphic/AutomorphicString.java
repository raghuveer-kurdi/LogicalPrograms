package automorphic;

import java.util.Scanner;

public class AutomorphicString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = -1;
		do {
			System.out.println("Enter a positive number to check its automorphic: ");
			while (!scanner.hasNextInt()) {
				System.out.println("Wrong input!!!. Input only positive number.");
				scanner.next();
			}
			inputValue = scanner.nextInt();
		} while (inputValue < 0);

		switch (inputValue) {
		case 0:
			//0 is not a automorphic number though its square is 0, because Squared number won't start with 0. More info check google.
			System.out.println("0 is not Automorphic number.");
			break;
		default:
			//Converting int values to string.
			String bInputVal = String.valueOf(inputValue);
			String squaredValue = String.valueOf(inputValue * inputValue);
			//if squared number ends with the given input, then its a automorphic. 
			if (squaredValue.endsWith(bInputVal))
				System.out.format("%s is a Automorphic number. Its Square is %s", bInputVal, squaredValue);
			else
				System.out.format("%s is not a Automorphic number. Its Square is %s", bInputVal, squaredValue);
		}

		scanner.close();
	}
}
