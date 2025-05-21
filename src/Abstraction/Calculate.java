package Abstraction;

//hiding implementation details and showing only the external datails to the user.
abstract class Calculate {
	
	public abstract void sum(int a, int b);
	
	public abstract void minus(int a, int b);
	
	public abstract void mul(int a, int b);
	
	public abstract void div(int a, int b);
}
