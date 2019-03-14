/*
 Author: David Serna
 Date: 3/7/2019
 Capital Guesser
 */
import java.util.Scanner;
public class chapter8_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int count = 0;
		
		      
		for(int r = 0; r < c.length; r++) {
		      System.out.print("What is the capital of" + ([r][1]));
		  		String user = input.nextLine();
		  	
		  	if(user.equalsIgnoreCase(user[r][1])) {
		  		System.out.print("Correct!");
		  		count++;
		  }
		  	else {
		  		System.out.print("Incorrect!");
		  	}}
			System.out.println("Amount correct:" + count);
		  }
		  	private static String[][] c = {
		  			   {"Salt Lake City","Utah"},
					   {"Montgomery","Alabama"},
		               {"Juneau","Alaska"},
		               {"Phoenix","Arizona"},
		               {"Little Rock","Arkansas"},
		               {"Sacramento","California"},
		               {"Denver","Colorado"},
		               {"Hartford","Conneticut"},
		               {"Honolulu","Hawaii"},
		               {"Springfield","Illinois"},
		      
		};
}
	

