package javaPackage;

public class Static3 {

	int roll;	//declaring global variable
	String name; //declaring global variable
	static String college = "calicut university";//static variable
	
	//constructor
	//when we create an object of the class the constructor is called.
	//when an object of this class is created it will look for the default constructor here already this contructor is present.
	Static3(int r, String n){
		roll = r;
		name = n;
	}
	public void getResult() {
		System.out.println(roll+" "+name+" "+college);
	}
}
