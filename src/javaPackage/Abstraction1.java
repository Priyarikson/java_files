package javaPackage;

public abstract class Abstraction1 {
	
	static int a = 5; //static variable
	int b = 5; //global variable
	final int c = 10; //final variable
	
	
	//abstract method
	abstract void eat();
	
	//non abstract method
	public void a() {
		System.out.println("non abstract method");
	}
		
	

}
