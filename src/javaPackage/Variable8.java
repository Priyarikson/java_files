package javaPackage;

public class Variable8 {
	
	int b =10; //Global variable
	static int c = 5; //static variable
	
// main method
	public static void main(String[] args) {
		int a = 6; //local variable
		System.out.println(a); //6
		
		//static member calling
		System.out.println(c); //5
		// or
		//static member calling
		System.out.println(Variable8.c); //5
		
		// static method calling 
		d(); //15
		//or
		// static method calling 
		Variable8.d(); //15
		
		//non static member calling
		//creating an object of that class
		Variable8 v8 = new Variable8();
		
		//object.variable ;
		System.out.println(v8.b); //10 b is a global variable
		
		//calling non - static method
		v8.f(); //5
		
		//calling an another class static variable in this class
		System.out.println(Variable7.j); //6
		
	}
	
	// static method
	public static void d() {
		
		int e = 15;//local variable
		System.out.println(e); // 15
	}
	// non-static method
	public void f() {
		
		int g = 5;//local variable
		System.out.println(g); // 5
	}

}
