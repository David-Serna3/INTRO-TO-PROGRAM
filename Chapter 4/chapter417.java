/*
Author: David Serna
Date: 0ct. 30, 2019
*/




 import java.util.Scanner;
public class chapter417 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a year: ");
			int year = input.nextInt();
			System.out.print("Enter a month, only 3 letters please uppercase the first letter: ");
			String month = input.next();
	     
			
			if ((month.equalsIgnoreCase("Jan")) || (month.equalsIgnoreCase("Mar")) || (month.equalsIgnoreCase("May"))  || month.equalsIgnoreCase("Dec")) {
				System.out.print("That month has 31 days");
			} else if ((month.equalsIgnoreCase("Apr") || month.equalsIgnoreCase("Jun") || month.equalsIgnoreCase("Sep")) || month.equalsIgnoreCase("Nov")){
				System.out.print("That month has 30 days");
			} else if (month.equalsIgnoreCase("Feb")) {
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					System.out.print("That month has 29 days");
				}
				else {
					System.out.print("That month has 28 days");
				}
				//print out 28 on a non leap year
				//or print out 29 on a leap yar
			}
			else {
				System.out.print("That is not a real month, try typing only 3 letters");
			}
		}
	}