package javaPackage;

public class Inheritance4 extends Inheritance3 {
	
	public void multiply(int x, int y) {
		z = x * y;
		System.out.println("Product is : " +z);
	}

	public static void main(String[] args) {
		int x = 30, y = 20;
		
		Inheritance4 i4 = new Inheritance4();
		
		i4.add(x, y);
		i4.substract(100, y);
		i4.multiply(x, y);
		i4.multiply(10, 30);

	}

}
