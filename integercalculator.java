
import java.util.Scanner;//imports the scanner utility

public class integercalculator
//Program: Integer calculator
//File: integercalculator.java
//Summary: Sums the integers of a 5 integer number
//Author: Christopher A Lambert
//Date 10/29/17
{
	public static void main(String args[])
	{
		int x, y, sum = 0;
		Scanner z = new Scanner(System.in);//creates the scanner z to analyze input
		System.out.print("Enter a 5-digit positive integer: ");//Prints a this command to the console for an input
		x = z.nextInt();
		while(x > 0)
		{
			y = x % 10;//This entire "while" section I don't fully understand, I had to go to stackoverflow, work through several examples and adjust them until I came to this functional setup
			sum = sum + y;//I'm not too certain this was supposed to be used, but I can't get it to work otherwise
			x = x / 10;
		}
		System.out.println("The sum of the digits is: " + sum);//prints the sum of the 5 integers to the console
	}
}