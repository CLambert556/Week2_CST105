import java.util.Scanner;

public class temperaturecalculator {
	//Program: Temperature Calculator
	//File: temperaturecalculator.java
	//Summary: Converts F to C and C to F.
	//Author: Christopher A Lambert
	//Date 10/29/17
	public static void main(String args[]) {
		Scanner temp = new Scanner(System.in);//creates a scanner to analyze the user input
		System.out.println("Enter a farenheit temperature: ");//Prompts the user for an input 
		float fahrenheit = temp.nextFloat();//Sets the user input to the variable fahrenheit
		float celsius = ((5 / 9) * fahrenheit - 32);//Sets the variable celsius to the conversion calculation based on the fahrenheit variable
		System.out.println(fahrenheit + "F is " + celsius + "C");//Outputs the celsius temperature from the conversion, this throws a logic error and I don't understand why
		Scanner temp2 = new Scanner(System.in);// Both scanners throw a "resource leak" saying the scanner is never closed. What does that mean?
		System.out.println("Enter a celsius temperature: ");//Prompts the user for an input
		float celsius2 = temp2.nextFloat();//Sets the user input to the variable celsius2
		float fahrenheit2 = ((9 / 5) * celsius2 + 32);//Sets the variable fahrenheit2 to the conversion calculation based on the celsius2 variable
		System.out.println(celsius2 + "C is " + fahrenheit2 + "F");//Outputs the fahrenheit2 result, this also throws a logic error and I don't understand why.
	}
}