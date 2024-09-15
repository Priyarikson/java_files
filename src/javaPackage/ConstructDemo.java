package javaPackage;

public class ConstructDemo {
	
	//Default constructor
	public ConstructDemo() {
		System.out.println("i am the constructor.");
	}
	
	//Parameterized constructor
	public ConstructDemo(int a, int b) {
		System.out.println("i am the parameterized constructor.");
		System.out.println(a);
		System.out.println(b);
	}
	public ConstructDemo(String str) {
		System.out.println("i am the parameterized string constructor.");
		System.out.println(str);
	}
	
	public void getData() {
		System.out.println("i am the method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructDemo demo = new ConstructDemo();
		ConstructDemo demo1 = new ConstructDemo(1, 3);
		ConstructDemo demo2 = new ConstructDemo("Hello i am a constructor.");
		
	}

}
