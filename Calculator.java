

// calculator program to calculate addition , multiplication , division of numbers

//creating a class for implementing a simple calculator
import java.util.*;

public class Calculator {
	
	// method for adding two numbers
	static int add(int a, int b)
	{
		// a,b are two numbers of type int
		return(a+b);
	}
	
	// method to multiply two numbers of type int
	static int multiply(int a, int b)
	{
		return a*b;
	}
	
	//method to divide two numbers of type int
	static int divide(int a, int b)
	{
		return a/b;
	}
	
	// main method for testing the calculator class methods
	public static void main(String[] args)
	{
		System.out.println(add(2,3));
		System.out.println(multiply(2,3));
		System.out.println(divide(6,3));
	}

}