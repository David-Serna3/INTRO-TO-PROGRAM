/*
Author: David Serna
Date: 12/6/18
*/



import java.util.Scanner;
class chap6_3 {
	public static int reverse (int number){
		int reverse = 0;
		int remain = 0;
		
		while (number != 0) {
			remain = number % 10;
			reverse = reverse * 10 + remain;		
			number = number /= 10;
					
		}
		return reverse;
		
	}
	
	public static boolean isPalindrome(int number) {
		boolean isPalindrome = false;
		int reverse = reverse(number);
		if (reverse == number) {
				isPalindrome = true;
		}		
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		System.out.print("Enter a number: ");
		user = input.nextInt();
		
		System.out.println("Is " + user + " a palindrome? " + isPalindrome(user));
	}
}