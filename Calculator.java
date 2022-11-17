package demo;

//Java program for simple calculator

import java.util.*;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args)
	{
		// stores two numbers
		double num1, num2;

		// Take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		// take the inputs
		try{
			num1 = sc.nextDouble();

			num2 = sc.nextDouble();
	
	

		System.out.println("Enter the operator (+,-,*,/)");

		char operator = sc.next().charAt(0);

		double num = 0;

		switch (operator) {

		// case to add two numbers
		case '+':

			num = num1 + num2;

			break;

		// case to subtract two numbers
		case '-':

			num = num1 - num2;

			break;

		// case to multiply two numbers
		case '*':

			num = num1 * num2;

			break;

		// case to divide two numbers
		case '/':

			num = num1 / num2;

			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");

		System.out.println();

		// print the final result
		System.out.println(num1 + " " + operator + " " + num2
						+ " = " + num);
		}

		catch(InputMismatchException e){
		System.out.println(e);

	}
}
}


