package javaDeepDiveBuildingBlocks_Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticCalculations ac=new ArithmaticCalculations();
		OperationsLoop:
		do{
			System.out.println("Please select the operation that you want to perform:\n"+
		"+. Addition\n"+
		"-. Subtraction\n"+
		"*. Multiplication\n"+
		"/. Division\n"+
		"0. Exit");
			Scanner sc=new Scanner(System.in);
			String o=sc.next();			
			switch(o) {
				case "+":					
					System.out.println("Please enter the first number that you want to add");
					double number1=sc.nextDouble();
					System.out.println("Please enter the second number that you want to add");
					double number2=sc.nextDouble();
					System.out.println("Sum of these numbers is: "+ac.addition(number1, number2));
					break;
				case "-":					
					break;
				case "*":					
					break;
				case "/":					
					break;
				case "0":
					break OperationsLoop;	
			}
		}while(1!=0);

	}

}

class ArithmaticCalculations{
	public double addition(double a, double b) {
		return a+b;
	}
	public double subtraction(double a, double b) {
		return a-b;
	}
	public double multiplication(double a, double b) {
		return a*b;
	}
	public double division(double a, double b) {
		return a/b;
	}
}
