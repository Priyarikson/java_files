package javaPackage;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we can write an array in below fashion as well
		
		int b[]= {1, 2, 3, 4, 5}; //defining an int array
		
		String s[] = {"s", "hello"}; //defining a string array
		
		Object a[] = {1, 2, 3, 4, 5, "selenium", 6, 6.5}; //defining an object array
		
		System.out.println(b.length); //5
		System.out.println(s.length); //2
		System.out.println(a.length); //8
		
		System.out.println(b[2]); //3
		System.out.println(s[1]); //hello
		System.out.println(a[5]); //selenium
		
		a[5] =7.5; //modifying an array value using index
		System.out.println(a[5]); //7.5
		
		
	}

}
