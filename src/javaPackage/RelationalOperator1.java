package javaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 300; //local variable
		int b = 200; //local variable
		
		if(a != b) {
			System.out.println("a is not equal to b");
		} else {
			System.out.println("a is equal to b");
		}
		
		String p = "HELLO"; //"he llo "space is aslo part of string.
		String q = "hello";
		
		//String comparison - 1st way - Case sensitive
		if (p == q) {
			System.out.println("p and q are equal for 1st way");
		}else {
			System.out.println("p and q are not equal for 1st way");
		}
		//String comparison - 2nd way - Case sensitive
		if (p.equals(q)) {
			System.out.println("p and q are equal for 2nd way");
		}else {
			System.out.println("p and q are not equal for 2nd way");
		}
		//String comparison - 3rd way - Case sensitive
		if (p.equalsIgnoreCase(q)) {
		System.out.println("p and q are equal for 3rd way");
		}else {
			System.out.println("p and q are not equal for 3rd way");
		}


	}

}
