// The combination is suitable for reading input from the console. It allows you to read lines of text.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInputStreamReaderClass {
    public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name and age: ");
		String namenage = reader.readLine();
		System.out.println(namenage);
	}
}
