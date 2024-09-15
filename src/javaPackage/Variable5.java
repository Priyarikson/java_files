package javaPackage;

public class Variable5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 100; // defining a local variable
		// int x = 200; no duplicate in the same scope
		
		//calling x variable for printing values
		System.out.println(x);
		
		//calling x variable for initializing y
		int y = x;
		System.out.println(y); //100
	}
	
	public static void b() {
		int x = 200; //x variable in a defferent scope
	}

}
