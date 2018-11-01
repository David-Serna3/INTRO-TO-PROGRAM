/*
 Author: David Serna
 Date: 10/24/2018
 */



import java.util.Scanner;
public class chap327 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point for x");
		double x = input.nextDouble();
		System.out.println("Enter a point for y");
		double y = input.nextDouble();
		
		if ((Math.abs(x) < 5 && Math.abs(y) < 2.5)){
			System.out.println("It is within the rectangle");
		}
		
		else {
			System.out.println("It is not within the rectangle");
		}

	}

}
