package javaPackage;

import java.util.ArrayList;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];//declared an array and have allocated memory for storing 5 elements.
		arr[0]=5;
		arr[1]=6;
		arr[2]=7;
		arr[3]=8;
		arr[4]=9;
		
		int[] arr2= {1,2,3,4,5,6,7,8,9,122};
		System.out.println(arr2[1]);
		
		System.out.println(arr2.length);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+", ");
			
		}
		System.out.println(" ");
		String[] names= {"priya","rikson","sam","ben"};
		
		//enhanced for loop
		for(String s:names) {
			System.out.println(s);
		}
		int[] arr3= {1,2,3,4,5,6,7,8,9,122};
		for(int i=0;i<arr3.length;i++) {
			if(arr3[i] % 2 == 0) {
				System.out.println(arr3[i]);
				//break; //exit
				
			}
			
				
		}
		
		ArrayList a = new ArrayList(); //ArrayList is the class a is the object
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("priya");
		ar.add("sam"); //add method
		ar.add("ben");
		
		System.out.println(ar);
		
		System.out.println(ar.get(2)); //extract from a arraylist 
		
		ar.remove(0); //index number //remove method
		
		System.out.println(ar);
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("aleena");
		name.add("kiara");
		name.add("shah");
		name.add("piyar");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("##############");
		for(String s:name) {
			System.out.println(s);
		}
		//item is present in arraylist
		System.out.println(name.contains("piyar"));
		String stri ="priyanka honey raju";
		
		//String[] splittedString= stri.split(" ");
		String[] splittedString= stri.split("honey");
		System.out.println(splittedString[0]);
		
		System.out.println(splittedString[1]);
		
		System.out.println(splittedString[1].trim());
		
		
		for(int i=stri.length()-1;i>=0;i--) {
			System.out.print(stri.charAt(i));
		}
		

	}

}
