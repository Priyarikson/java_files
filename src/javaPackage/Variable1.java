package javaPackage;

public class Variable1 {
	static int z = 87;
	public static void main(String[]args) {
		
		int a =5; //int type local variable
		System.out.println(a);//5 - calling a variable
		
		int x =100; //int type local variable
		System.out.println(x);
		
		x=200; //modification of value
		System.out.println(x); //200
		System.out.println(3 > 122);//false
		
		
		char c ='a'; //char type local variable,should be placed inside single quote
		System.out.println(c); //a
		
		boolean b = true;
		b= false;
		System.out.println(b);//false
		
		System.out.println(3 > 122);//false. checking condition 
		
		int e=100;
		int d=200;
		boolean z=e<d;
		System.out.println(z);
		
		String strNew = "priyanka";
		double deci = 5.50;
		
		System.out.println(strNew + deci + "double is a decimal");
		
		//dataType casting
		// converting from double to float:
			double someValue;
			someValue = 5.99;
			// cast someValue to float!
			float newValue = (float)someValue;
			System.out.println(newValue);
			
	
		
	}
	public static void bMethod() {
		System.out.println("rikson");
		
	}

}
