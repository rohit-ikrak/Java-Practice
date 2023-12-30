//The'Scanner' class is a versatile option for reading input from various sources, including the keyboard.

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String userInput = scanner.nextLine();
		System.out.println(userInput);
		scanner.close();
	}
}
