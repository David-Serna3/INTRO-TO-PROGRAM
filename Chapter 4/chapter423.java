/*
Author: David Serna
Date: 11/1/18
*/



import java.util.Scanner;
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		String emp = input.next();
		System.out.print("Enter the numbers of hours worked: ");
		double numHour = input.nextDouble();
		System.out.print("Enter the hourly pay rate: ");
		double hrpay = input.nextDouble();
		System.out.print("Enter federal tax witholding rate: ");
		double ftw = input.nextDouble();
		System.out.print("Enter state tax witholding rate: ");
		double stw = input.nextDouble();
		
		double grossPay = 0.0;
		double fw = 0.0;
		double sw = 0.0;
		double deduct = 0.0;
		double netPay = 0.0;
		
		fw = grossPay * ftw;
		sw = grossPay * stw;
		deduct = fw + sw;
		netPay = grossPay - deduct;
		grossPay = hrpay * numHour;
		
		System.out.println("Employees Name: " + emp);
		System.out.println("Hours Worked: " + numHour);
		System.out.println("Pay Rate: " + hrpay);
		System.out.print("Gross Pay: " + grossPay);
		System.out.println("Deductions:");
		System.out.println("Federal Witholding: " + fw);
		System.out.println("State Witholding: " + sw);
		System.out.println("Total Deductions: " + deduct);
		System.out.println("Net Pay: " + netPay);
		
		
		
		
	}
}
