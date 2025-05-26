package SerializationAndDeserialization;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	private transient String name;
	private int id;
	private double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Employee em = new Employee("kalpana", 17, 10.0);
		
		try (ObjectOutputStream objeOutput = new ObjectOutputStream(new FileOutputStream("D:\\Employee.ser"))) {
			objeOutput.writeObject(em);
			System.out.println("Serialized data is saved in employee.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("D:\\Employee.ser"))) {
			Employee deSerialization = (Employee) objectInput.readObject();
			FileWriter fileWriter =new FileWriter("D:\\Employee-object.txt");
			fileWriter.write(deSerialization.toString());
			System.out.println("De-serialized data is saved in Employee-object.txt");
			fileWriter.close();
//			System.out.println("Deserialized Employee: " + deSerialization);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}




