package javaPackage;

public class BreakStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1; //local variable
		
		while(i <= 5) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}
