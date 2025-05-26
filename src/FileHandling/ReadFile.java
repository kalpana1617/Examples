package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader("E:\\Employee.txt");
			int character;
			while ((character = fileReader.read()) != -1) {
				System.out.print((char) character);
			}
			fileReader.close();
			//System.out.println("Successfully read to the file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
