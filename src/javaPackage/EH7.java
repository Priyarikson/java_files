package javaPackage;

public class EH7 {
	
	public static void a (int age) {
		try {
			if (age < 18) {
				throw new ArithmeticException("Not Applicable");
			} else {
				System.out.println("Applicable");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException, ArithmeticException, Exception {
		
		Thread.sleep(2000);
		a(15);
		a(19);

	}

}
