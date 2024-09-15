package javaPackage;

public class pyramidMulty3 {

	public static void main(String[] args) {

		int k=3;
		for (int i=0;i<3;i++) {
			
			//System.out.println("outer");
			
			for(int j=0;j<=i;j++) {
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
				
			}
			System.out.println(" ");
			//System.out.println("outer");
		}
	}

}
