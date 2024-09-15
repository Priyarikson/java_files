package javaPackage;

public class FirstJavaProgram {

	int a=5;//global variable
	static int c=10; //static variable


	//double slash is used for comment a line
	//main method-predefined method
	// short cut to write main method - type ma(main) inside class body
	// press ctrl+space from keyboard
	public static void main(String[] args) {

		//short cut to write System.out.println();
		//type syso inside method body and press ctrl+space.

		System.out.println("Priyanka");
		System.out.println("Smauel");
		aMethod();
		bMethod();
		cMethod();

		int bin = 5; //local variable
		//object creation
		FirstJavaProgram v8 = new FirstJavaProgram();

		v8.c();

		System.out.println(Variable1.z);
	}
	//user defined method
	public static void aMethod() {
		System.out.println("hello");


	}
	//user defined method
	public static void bMethod() {
		System.out.println("rikson");

	}
	//user defined method
	public static void cMethod() {
		int h = 3; //local variable
		System.out.println(h);

	}
	public  void c() {
		int hi = 5; //local variable
		String s = "rim";
		System.out.println(hi);
		System.out.println(s);

	}

}
