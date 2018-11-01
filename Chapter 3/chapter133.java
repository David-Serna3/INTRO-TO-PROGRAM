/*
 Author: David Serna
 Date: 10/15/2018
 */




import java.util.Scanner;
public class chapter133 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, d, e, f, x, y = 0.0;
		
		System.out.println("Enter a value for a");
		 a = input.nextDouble();
		System.out.println("Enter a value for b");
		 b = input.nextDouble();
		System.out.println("Enter a value for c");
		 c = input.nextDouble();
		System.out.println("Enter a value for d");
		 d = input.nextDouble();
		System.out.println("Enter a value for e");
		 e = input.nextDouble();
		System.out.println("Enter a value for f");
		 f = input.nextDouble();
		 
		 if ((a * d) - (b * c) == 0) {
			 System.out.println("system cannot divide by zero");
		  
		 }
		 else {
			 
		     x = (e * d) - (b * f) / (a * d) - (b * c);
		     y = (a * f) - (e * c) / (a * d) - (b * c);
		    System.out.println("x =" + x);
		    System.out.println("y =" + y);
		 }
	}

}
