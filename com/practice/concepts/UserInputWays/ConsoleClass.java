// The 'Console' class provides methods for reading input without creating objects. 
// It may return 'null' if the console is not available.
//This will not be used.

import java.io.Console;

public class ConsoleClass {
    public static void main(String[] args) {
		Console console = System.console();
		
		if(console!=null) {
			String userInput = console.readLine("Enter your name and age: ");
			System.out.println(userInput);
		}
		
	}
}
