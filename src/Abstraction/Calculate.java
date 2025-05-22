package Abstraction;

//Hides implementation details; shows only essential features
abstract class Calculate {
	
	public abstract void sum(int a, int b);
	
	public abstract void minus(int a, int b);
	
	public abstract void mul(int a, int b);
	
	public abstract void div(int a, int b);
}
