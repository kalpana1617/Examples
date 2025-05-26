package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {

		try {
			FileWriter fileWriter = new FileWriter("E:\\Employee.txt");
			fileWriter.write("Hello, this is Java file handling!");
			fileWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}



