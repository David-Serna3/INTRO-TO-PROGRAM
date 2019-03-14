import java.util.Scanner;

/*
Author: David Serna
Date: 2/22/19

Matrix Math
*/
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double oj [][] = new double[3][3];
		double aj [][] = new double[3][3];
		double[][] oreos = new double[3][3];
		
		
		for (int row = 0; row < 3; row++) {
			System.out.print("Enter 3 numbes for row " + (row + 1) + " for Matix A: ");
			for (int col = 0; col <= 2; col++) {
				oj[row][col] = input.nextDouble();
			}
		}
		for (int row = 0; row < 3; row++) {
			System.out.print("Enter 3 numbers for row " + (row + 1) + " for Matrix B: ");
			for (int col = 0; col <= 2; col++) {
				aj[row][col] = input.nextDouble();
			}
		}
		oreos = addMatrix(oj, aj);
		// counts rows
		for(int row = 0; row < 2; row++) {
			
			for(int col = 0; row < 3; col++) {
				System.out.print(oreos[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] addMatrix(double[][] a, double [][] b) {
		double[][] c = new double[3][3];
		
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[0].length; col++) {
				c[row][col] = a[row][col] + b[row][col];
			}
		}
		return c;
	}
}