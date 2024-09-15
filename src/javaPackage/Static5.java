package javaPackage;

public class Static5 {
	
	static int z = 5; // static variable
	int y = 1;//global variable
	
	// static method

	public static void a() {
		// TODO Auto-generated method stub
		z = 10;
		System.out.println(z); //10
	}
	
	//non static method
	public void b() {
		z = 15;
		System.out.println(z); //15
		a();
	}
	
	public static void main(String[]args) {
		System.out.println(z); //5
		a(); //10
		Static5 s5 = new Static5();
		s5.b(); //15, 10
	}

}
