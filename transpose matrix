package java_project;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter the no of rows");
		int rows =sc.nextInt();
		System.out.println("Enterthe no of cols");
		int cols = sc.nextInt();
		int [][]matrix= new int[rows][cols];
		int [][]transpose=new int [rows][cols];		
		System.out.println("Enter the matrix elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
				
			}
		}
			for(int i =0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					transpose[i][j]=matrix[j][i];
		}
			}
				for(int i =0;i<cols;i++) {
					for(int j=0;j<rows;j++) {
						System.out.println(transpose[i][j]+" ");
			}	
				}
		
}
}
