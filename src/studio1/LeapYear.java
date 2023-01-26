package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in); 
		
		
		System.out.print("What year is it");
		int year = in.nextInt();
		int remainder = year % 100;
		int remainder4 = year % 4;
		int remainder400 = year % 400;
		boolean leapYear = ( remainder != 0) && (remainder4 == 0) || (remainder400 == 0);
		
		System.out.print(leapYear);
		

	}

}
