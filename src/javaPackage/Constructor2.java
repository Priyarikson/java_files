package javaPackage;

public class Constructor2 {
	
	int id; //global variable
	String name; //global variable
	String address; //global variable
	
	// Default constructor
	Constructor2(){
		System.out.println("Hello default constructor");
	}
	// Parameterized constructor
	Constructor2(int a, String b, String c){
		this.id = a;
		name = b;
		address = c;
	}
	
	//non static method
	public void displayInfo() {
		System.out.println(id + " " + name + " " + address);
	}
	public static void main(String[] args) {
		
		//default constructor
		Constructor2 c2 = new Constructor2();
		
		// Parameterized constructor
		Constructor2 c3 = new Constructor2(1, "John", "London");
		c3.displayInfo();
		
		Constructor2 c4 = new Constructor2(2, "Peter", "London");
		c4.displayInfo();
		
	}

}
