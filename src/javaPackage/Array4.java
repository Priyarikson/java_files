package javaPackage;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defining multi dimentional array
		int a[][] = {{1, 2, 3, 7}, {4, 5, 6, 8}, {7, 8, 9, 6}};
		
		//total number of rows
		int row = a.length; //length is the property of an array
		System.out.println("Total Rows: "+ row);
		
		//total number of columns
		
		int columns = a[0].length;//length is the property of an array
		System.out.println("Total Rows: "+ columns);
		
		//print all data in matrix form
		//outer loop
		for(int i = 0; i < row; i++) {
			
			//inner loop
			for(int j = 0; j < columns; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
