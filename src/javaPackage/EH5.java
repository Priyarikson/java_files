package javaPackage;

public class EH5 {

	public static void main(String[] args) {
		
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {// finally can come either after try block or after catch block.
			
			System.out.println("finally will always execute");
		}

	}

}
