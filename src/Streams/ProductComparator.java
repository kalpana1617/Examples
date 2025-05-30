package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product {

	String name;
	double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " - $" + price;
	}
}

public class ProductComparator {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Pen", 10.0), new Product("NoteBook", 20.0),
				new Product("pencil", 5));

		products.sort(Comparator.comparing(p -> p.price));

		products.forEach(System.out::println);
	}

}
