/*
 Author: David Serna
 Date: 10/22/2018
 */



import java.util.Scanner;


public class chap319 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double perimeter = 0.0;
		System.out.println("Enter a number for side A of a triangle");
		double sideA = input.nextDouble();
		System.out.println("Enter a number for side B of a triangle");
		double sideB = input.nextDouble();
		System.out.println("Enter a number for side C of a triangle");
		double sideC = input.nextDouble();
		
		if (sideA + sideB > sideC) {
			System.out.println("Input not valid");
		}
		else {
			perimeter = sideA + sideB + sideC;
			System.out.println("Perimeter of triangle:" + perimeter);
		}
	}

}
