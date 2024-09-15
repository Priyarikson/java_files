package javaPackage;

public class IfElse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 15; //local variable
		int weight = 55; //local variable
		
		//outer if block
		if( age > 18) {
			//inner if block
			if(weight > 50) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not Eligible");
			}
		} else {
			System.out.println("Age is not greater than 18");
		}
		

	}

}
