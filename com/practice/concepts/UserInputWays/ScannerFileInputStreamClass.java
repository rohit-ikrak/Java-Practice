//assume there is a file named input.txt in your system.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileInputStreamClass {
    public static void main(String[] args) {
		try {
			Scanner fileScanner = new Scanner(new File("C:/Users/ROHIT KARKI/OneDrive/Desktop/input.txt"));
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
