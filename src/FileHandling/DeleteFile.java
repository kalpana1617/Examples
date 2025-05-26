package FileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {

		File file = new File("E:\\Employee.txt");
		if (file.delete()) {
			System.out.println("Deleted the file: " + file.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}
}
