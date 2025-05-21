package Encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Employee em = new Employee();
		em.setId(101);
        em.setName("Srikanth");

        System.out.println("Employee ID: " + em.getId());
        System.out.println("Employee Name: " + em.getName());
	}

}
