package javaPackage;

public class Abstraction2 extends Abstraction1 {
	
	void eat() {
		System.out.println("please eat");
	}

	public static void main(String[] args) {
		Abstraction2 a2 = new Abstraction2();
		a2.eat();
		a2.a();

	}

}
