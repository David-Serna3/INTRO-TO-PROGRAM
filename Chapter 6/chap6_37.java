/*
Author: David Serna
Date: 12/14/18
*/


import java.util.Scanner;
class chap6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		System.out.print("Enter a width: ");
		int width = input.nextInt();
		System.out.print(format(num,width));
			
	}
	public static String format(int number, int width) {
		String format = "";
		int size = 0;
		int num = number;
		while (num > 0) {
			size += 1;
			num = num /10;
		}
		if(width < size){
			format = Integer.toString(number);
		
			
		}
		else{
			width = width - size;
			for(int counter = 0; counter < width; counter++){
				format+= "0";
			}
			format += number;
		}
		return format;
	}
}