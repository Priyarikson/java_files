package javaPackage;

public class LogicalOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10; //local variable
		int b = 5; //local variable
		int c = 20; //local variable
		
		//logical operator
		System.out.println(a < b && a < c); //false a < b >>>false ,so it won't check the other side a < c.
		
		//bitwise operator
		System.out.println(a < b & a < c); //false //here checks two side of condition false & true >>false
		
		
		System.out.println(a < b && a++ < c);
		System.out.println(a); //10
		System.out.println(a < b & a++ < c);
		System.out.println(a); //11
		
	}

}
