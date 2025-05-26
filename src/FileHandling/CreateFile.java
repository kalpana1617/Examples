package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		File file = new File("E:\\Employee.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created:" + file.getName());
			} else {
				System.out.println("File already exist");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
