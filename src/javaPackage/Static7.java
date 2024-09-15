package javaPackage;

public class Static7 {
	//non static will get memory allocation when we create object
	// object is an instance of an class contains continous memory allocation of all non static variables of a class with specific data for that instance .
	
	
	String a; // Global variable
	int b; // Global variable
	
	static int c = 4; //static variable
	
	
	//static method
	public static void a() {
		System.out.println("Hello Static");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static7 s7 = new Static7();
		
		s7.a = "Selenium";
		s7.b = 1;
		c = 2;
		a();
		
		System.out.println(s7.a+" "+s7.b+" "+c);
		
		int j = 5;
		j = j; //variable initialization with same variable.
		System.out.println(j); // 5
		
		
		
		
	}

}
