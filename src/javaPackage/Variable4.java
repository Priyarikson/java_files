package javaPackage;

public class Variable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 100}; //integer type array
		String b[]= {"John", "Peter"}; //string type array
		
		System.out.println(b[0]); // John	
		System.out.println(b[1]); // Peter
		System.out.println(a[0]); // 1
		System.out.println(a[4]); // 5
		System.out.println(a[2]); // 3
		
		Object c[] = {1, 2, 3, "John", "Peter", 'a', 'b', 3>12};
		
		System.out.println(c[0]); // John	
		System.out.println(c[3]); // John	
		System.out.println(c[5]); // John	
		System.out.println(c[7]); // John	
		
	}

}
