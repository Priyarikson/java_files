package javaPackage;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring an array
		int a[]= new int[5];
		
		//printing the length of an array
		System.out.println(a.length);
		
		//print default value of an integer array
		for(int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
		//Assigning value to an array
		a[0]=5;
		a[1]=4;
		a[2]=10;
		a[3]=12;
		a[4]=8;
		
		// a[5]=20; java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(a[2]); //10
		
		//print all array elements
		for(int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
	}

}
