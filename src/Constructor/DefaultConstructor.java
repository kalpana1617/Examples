package Constructor;

public class DefaultConstructor {

	int id;
	String name;

	DefaultConstructor() {
	}

	public static void main(String[] args) {
		DefaultConstructor dc = new DefaultConstructor();
		System.out.println("Id:" + dc.id);
		System.out.println("Name:" + dc.name);
	}

}
