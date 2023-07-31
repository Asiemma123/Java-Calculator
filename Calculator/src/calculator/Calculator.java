package calculator;

import java.lang.Math;
import java.util.Scanner;

public class Calculator {
	
	//Instance Variables
	double sqrt;
	double sine;
	double cosine;
	double tangent;
	double factorial;
	static int number1;
	
	//Constructor
	public Calculator() {
		
		
		// Create an object of the Scanner class
		
		//Prompt user for input 1
		System.out.println("Please enter an interger first number  ");
		number1 = Integer.parseInt(new Scanner(System.in).nextLine());
		

		// Find the square root 
		sqrt= Math.sqrt(number1);
		
		// Find the sine 
		sine=Math.sin(number1);
		
		//Find the cosine 
		cosine=Math.cos(number1);
		
		//Find the tangent
		tangent=Math.tan(number1);
		
		// Find the Factorial 
		
		
	}
	// method to add 2 integers 
	static int add(int num1, int num2) {
		return num1+num2;
	}
	// method to subtract 2 integers
	
	static int substract(int num1, int num2) {
		return num1-num2;
	}
	//Multiplication method 
	static int multiply(int num1, int num2) {
		return num1*num2;
	}
	//Division method
	static int divide(int num1,int num2) {
		return num2/num1;
	}
	
	// Square method
	static int square(int num1,int num2) {
		return num1*num1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myAdd=add(1,2);
		System.out.println(myAdd);
		
		int mySubstract=substract(4,2);
		System.out.println(mySubstract);
		
		int myMultiplication=multiply(2,6);
		System.out.println(myMultiplication);
		
		int myDivide=divide(2,6);
		System.out.println(myDivide);
		
		int mySquare= square(2,2);
		System.out.println(mySquare);
		
	
		
		Calculator magicCalculator=new Calculator();// Create an object of Calculator
		
		System.out.println(" Square root of the number you entered is: " +magicCalculator.sqrt);
		System.out.println(" Sine of the number you entered is       : "+magicCalculator.sine);
		System.out.println(" Cosine of the number you entered is     : "+magicCalculator.cosine);
		System.out.println(" Tangent of the number you entered is    : "+magicCalculator.tangent);

	}

}
